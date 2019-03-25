package ShoppingCart;

import java.rmi.UnexpectedException;

public class ItemFactory {
    public static IItem Create(String itemName) throws UnexpectedException {
        switch (itemName) {
            case "Apple": return new Item(60);
            case "Orange": return new Item(25);
            default: throw new UnexpectedException("Unexpected value " + itemName + " entered");
        }
    }
}
