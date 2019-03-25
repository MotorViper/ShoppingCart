package ShoppingCart;

/**
 * This represents the till.
 */
public interface ITill {
    void addItem(IItem item);
    void addItems(Iterable<IItem> items);
    void setOfferList(IOfferList offers);
    void reset();
    int sum();
}
