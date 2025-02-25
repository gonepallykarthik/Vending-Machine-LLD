package VendingMachine.Impl;

import VendingMachine.Coin;
import VendingMachine.Item;
import VendingMachine.VendingMachine;

public interface VendingState {
    void clickOnInsertCoinsButton(VendingMachine machine) throws Exception;
    void insertCoins(VendingMachine machine, Coin coin) throws Exception;
    void clickOnProductSelectionButton(VendingMachine machine) throws Exception;
    void chooseProduct(VendingMachine machine, String code) throws Exception;
    Item dispenseProduct(VendingMachine machine, String code) throws Exception;
    Coin refundMoney(VendingMachine machine)  throws Exception;
    int returnChange(int returnChangeMoney) throws Exception;
}
