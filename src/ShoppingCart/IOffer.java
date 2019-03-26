package ShoppingCart;

public interface IOffer {
    void addItem(IItem item);

    int getDiscount();

    void reset();

    void discountUsed();
}
