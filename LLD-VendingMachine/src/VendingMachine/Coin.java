package VendingMachine;

public enum Coin {
    RUPEE(1),
    DOLLAR(80),
    QUARTER(25);

    public int value;

    Coin(int val) {
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }
}
