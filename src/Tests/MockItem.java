package Tests;

import ShoppingCart.IItem;

/**
 * Implementation of IItem for testing.
 */
public class MockItem implements IItem {
    private final int _price;
    private final int _id;

    MockItem(int price) {
        _price = price;
        _id = 0;
    }

    MockItem(int price, int id) {
        _price = price;
        _id = id;
    }

    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public int getID() {
        return _id;
    }
}
