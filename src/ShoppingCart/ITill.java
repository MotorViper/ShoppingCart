package ShoppingCart;

/**
 * This represents the till.
 */
public interface ITill {
    void addItem(IItem item);
    void reset();
    int sum();
}
