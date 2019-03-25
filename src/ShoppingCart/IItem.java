package ShoppingCart;

/**
 * This interface represents an item that can be purchased.
 */
public interface IItem {
    /**
     * Gets the price in pence.
     */
    int getPrice();

    /**
     * Gets the unique id of this item.
     */
    int getID();
}
