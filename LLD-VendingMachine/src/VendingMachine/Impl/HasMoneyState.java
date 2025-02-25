package VendingMachine.Impl;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements VendingState{

    @Override
    public void clickOnInsertCoinsButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert coin button ");
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Insert coins");
        machine.getCoins().add(coin);

    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setState(new ProductSelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, String code) throws Exception {
        throw new Exception("You cannot choose product! ");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String code) throws Exception {
        throw new Exception("You cannot dispense product! ");
    }

    @Override
    public Coin refundMoney(VendingMachine machine) throws Exception {
        System.out.println("refund the money! ");
        if(!machine.getCoins().isEmpty()) {
            return machine.getCoins().getLast();
        }
        machine.setState(new IdleState());
        return null;
    }

    @Override
    public int returnChange(int returnChangeMoney) throws Exception {
        throw new Exception("Cannot return money! ");
    }
}
