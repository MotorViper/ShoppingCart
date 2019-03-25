package Tests;

import ShoppingCart.IItem;

/**
 * Implementation of IItem for testing.
 */
public class MockItem implements IItem {
    private final int _price;
    
    MockItem(int price) {
        _price = price;
    }

    @Override
    public int getPrice() {
        return _price;
    }
}
