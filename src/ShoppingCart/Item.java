package ShoppingCart;

/**
 * This is a placeholder for an actual item that can be purchased,
 */
public class Item implements IItem {
    private final int _price;

    public Item(int price) {
        _price = price;
    }

    @Override
    public int getPrice() {
        return _price;
    }
}
