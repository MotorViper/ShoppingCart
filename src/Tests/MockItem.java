package Tests;

import ShoppingCart.IItem;

/**
 * Implementation of IItem for testimg.
 */
public class MockItem implements IItem {
    private int _price;
    
    public MockItem(int price) {
        _price = price;
    }

    @Override
    public int getPrice() {
        return _price;
    }
}
