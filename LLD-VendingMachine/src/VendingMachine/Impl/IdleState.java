package VendingMachine.Impl;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;

import java.util.ArrayList;

public class IdleState implements VendingState{

    public IdleState() {
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Machine is on Idle State");
        machine.setCoins(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinsButton(VendingMachine machine) throws Exception {
        System.out.println("Clicked on insert coins button!");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coins before clicking on insert coins button! ");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("You must ClickOnInsertCoinsButton and Insert coins before Clicking on productSelection Button! ");
    }

    @Override
    public void chooseProduct(VendingMachine machine, String code) throws Exception {
        throw new Exception("You must ClickOnInsertCoinsButton and Insert coins before selecting the product ");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String code) throws Exception {
        throw new Exception("You must ClickOnInsertCoinsButton and Insert coins before dispensing the product! ");
    }

    @Override
    public Coin refundMoney(VendingMachine machine) throws Exception {
        throw new Exception("You cannot refund money in idle state! ");
    }

    @Override
    public int returnChange(int returnChangeMoney) throws Exception {
        throw new Exception("You cannot return change in idle State");
    }
}
