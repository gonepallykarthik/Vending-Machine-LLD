package VendingMachine;

import VendingMachine.Impl.VendingState;

public class Main {
    public static void main(String[] args) {
        System.out.println("Low level Design of Vending Machine! ");
        VendingMachine machine = new VendingMachine(5);
        System.out.println(machine.getInventory());
        try{
            VendingState state = machine.getState();
            // click on insert coin button
            machine.getState().clickOnInsertCoinsButton(machine);
            // click on insert coins button
            machine.getState().insertCoins(machine, Coin.RUPEE);
            // click on product selection button
            machine.getState().clickOnProductSelectionButton(machine);
            // choose Product enter the Product code
            machine.getState().chooseProduct(machine, "104");
            // dispense the product
            Item item = machine.getState().dispenseProduct(machine, "104");
            System.out.println(item);

        }catch (Exception e) {
            System.out.println("Exception occurred " + e.getMessage());
        }
    }
}