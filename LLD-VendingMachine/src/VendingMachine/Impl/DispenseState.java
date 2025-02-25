package VendingMachine.Impl;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;

import java.util.List;
import java.util.Optional;

public class DispenseState implements VendingState{
    @Override
    public void clickOnInsertCoinsButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert button!");
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
        throw new Exception("You cannot choose product!");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, String code) throws Exception {
        Optional<Item> itemOptional = machine.getInventory().getItem(code);
        if(itemOptional.isEmpty()) {
            throw new Exception("The product you choosed is not available! " + code);
        }

        System.out.println("Product is dispensed " + code);
        return itemOptional.get();
    }

    @Override
    public Coin refundMoney(VendingMachine machine) throws Exception {
        throw new Exception("Cannot refund Money!");
    }

    @Override
    public int returnChange(int returnChangeMoney) throws Exception {
       throw new Exception("");
    }
}
