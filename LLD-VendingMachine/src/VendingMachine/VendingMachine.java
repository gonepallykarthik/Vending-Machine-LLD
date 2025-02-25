package VendingMachine;

import VendingMachine.Impl.IdleState;
import VendingMachine.Impl.VendingState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingState state;
    private List<Coin> coins;
    private Inventory inventory;

    public VendingMachine(int InventorySize) {
        this.inventory = new Inventory(InventorySize);
        this.state = new IdleState();
        this.coins = new ArrayList<>();
    }

    public VendingState getState() {
        return state;
    }

    public void setState(VendingState state) {
        this.state = state;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
