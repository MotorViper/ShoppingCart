package ShoppingCart;

/**
 * This is a placeholder for an actual item that can be purchased,
 */
public class Item implements IItem {
    private final int _price;
    private final int _id;

    public Item(int id, int price) {
        _id = id;
        _price = price;
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
