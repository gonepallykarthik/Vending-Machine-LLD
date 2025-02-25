package VendingMachine;

import java.util.Optional;

public class Inventory {
   private ItemShelf[] itemShelves;

   public Inventory(int itemCount) {
       this.itemShelves = new ItemShelf[itemCount];
       initInventory();
   }

    public ItemShelf[] getItemShelves() {
        return itemShelves;
    }

    public void setItemShelves(ItemShelf[] inventory) {
        this.itemShelves = inventory;
    }

    private void initInventory(){
       int startcode = 101;
       String[] tempItem = new String[]{"PEPSI", "COKE", "SODA", "WATER", "JUICE"};
       int itemCount = 0;
       for(int i=0; i<this.itemShelves.length; i++){
           ItemShelf itemShelf = new ItemShelf();
           itemShelf.setCode(String.valueOf(startcode));
           // create an Item
           Item item = new Item();
           item.setItem(ItemType.valueOf(tempItem[itemCount]));
           item.setPrice(1);
           itemShelf.setItem(item);

           startcode += 1;
           itemCount = (itemCount + 1) % tempItem.length;
           itemShelves[i] = itemShelf;
       }
    }

    public int getItemPrice(String codeNumber){
       for (ItemShelf itemShelf : this.itemShelves){
           if (itemShelf.getCode().equals(codeNumber)){
               return itemShelf.getItem().getPrice();
           }
       }

       return 0;
    }

    public Optional<Item> getItem(String codeNumber) {
       for (ItemShelf itemShelf : this.itemShelves) {
           if(itemShelf.getCode().equals(codeNumber)) {
               return Optional.of(itemShelf.getItem());
           }
       }

       return Optional.empty();
    }

    public boolean isItemAvailable(String codeNumber) {
        for (ItemShelf itemShelf : this.itemShelves) {
            if(itemShelf.getCode().equals(codeNumber)) {
                return true;
            }
        }

        return false;
    }
}
