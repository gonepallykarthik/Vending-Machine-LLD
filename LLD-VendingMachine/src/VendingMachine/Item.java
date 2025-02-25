package VendingMachine;

public class Item {
    private ItemType item;
    private int price;

    public ItemType getItem() {
        return item;
    }

    public void setItem(ItemType item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
