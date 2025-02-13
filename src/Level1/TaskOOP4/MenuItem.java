package Level1.TaskOOP4;

import java.util.Objects;

public class MenuItem {
    private String itemName;
    private int itemPrice;

    public MenuItem(){}

    public MenuItem(String itemName, int itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return itemPrice == menuItem.itemPrice && Objects.equals(itemName, menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemPrice);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
