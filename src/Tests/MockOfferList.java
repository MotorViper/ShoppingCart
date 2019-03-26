package Tests;

import ShoppingCart.IItem;
import ShoppingCart.IOffer;
import ShoppingCart.IOfferList;

public class MockOfferList implements IOfferList {

    @Override
    public void addItem(IItem item) {
    }

    @Override
    public void addOffer(IOffer offer) {
    }

    @Override
    public int getDiscount() {
        return 50;
    }

    @Override
    public void reset() {
    }

    @Override
    public void discountUsed() {
    }
}
