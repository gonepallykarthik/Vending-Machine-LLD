package VendingMachine.Impl;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;

import java.util.List;


public class ProductSelectionState implements VendingState{
    @Override
    public void clickOnInsertCoinsButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert coins!");
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert coins!");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on product selection button!");
    }

    @Override
    public void chooseProduct(VendingMachine machine, String code) throws Exception {
        System.out.println("choose Product!");
        boolean isAvailable = machine.getInventory().isItemAvailable(code);
        if(!isAvailable) {
            throw new Exception("The Product you choosed is not available " + code);
        }
        int itemPrice = machine.getInventory().getItemPrice(code);
        int paidByUser = machine.getCoins().getLast().getValue();
        if(paidByUser < itemPrice) {
            throw new Exception("Insufficient funds the item price is " + itemPrice + " and you payed is " + paidByUser);
        }
        if(itemPrice - paidByUser > 0) {
            returnChange(itemPrice - paidByUser);
        }
        machine.setState(new DispenseState());
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
        System.out.println("balance amount is " + returnChangeMoney);
        return returnChangeMoney;
    }
}
