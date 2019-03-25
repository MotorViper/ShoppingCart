package ShoppingCart;

/**
 * Implementation of ITill.
 */
public class Till implements ITill {
    private int _sum = 0;

    @Override
    public void addItem(IItem item) {
        _sum += item.getPrice();
    }

    @Override
    public void addItems(Iterable<IItem> items) {
        for (IItem item: items) {
            addItem(item);
        }
    }

    @Override
    public int sum() {
        return _sum;
    }
    
    @Override
    public void reset() {
        _sum = 0;
    }
}
