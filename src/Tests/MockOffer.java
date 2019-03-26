package Tests;

import ShoppingCart.IItem;
import ShoppingCart.IOffer;

public class MockOffer implements IOffer {
    private int _discount;

    MockOffer(int discount) {
        _discount = discount;
    }

    @Override
    public void addItem(IItem item) {
    }

    @Override
    public int getDiscount() {
        return _discount;
    }

    @Override
    public void reset() {
        _discount = 0;
    }

    @Override
    public void discountUsed() {
        _discount = 0;
    }
}
