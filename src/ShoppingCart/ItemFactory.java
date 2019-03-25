package ShoppingCart;

import java.rmi.UnexpectedException;

public class ItemFactory {
    public static final int ORANGE = 0;
    public static final int APPLE = 1;

    public static IItem Create(String itemName) throws UnexpectedException {
        switch (itemName) {
            case "Apple": return new Item(APPLE, 60);
            case "Orange": return new Item(ORANGE, 25);
            default: throw new UnexpectedException("Unexpected value " + itemName + " entered");
        }
    }
}
