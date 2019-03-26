package ShoppingCart;

public interface IOfferList {
    void addItem(IItem item);

    void addOffer(IOffer offer);

    int getDiscount();

    void reset();

    void discountUsed();
}
