package ShoppingCart;

public abstract class OfferBase implements IOffer {
    private int _count = 0;
    private int _discount;
    private final int _id;

    OfferBase(int id) {
        _id = id;
    }

    int getCount() {
        return _count;
    }

    void setCount(int count) {
        _count = count;
    }

    @Override
    public void addItem(IItem item) {
        if (item.getID() == _id) {
            doAddItem(item);
        }
    }

    @Override
    public int getDiscount() {
        return _discount;
    }

    void addDiscount(int value) {
        _discount += value;
    }

    protected abstract void doAddItem(IItem iItem);

    @Override
    public void reset() {
        _count = 0;
        _discount = 0;
    }

    @Override
    public void discountUsed() {
        _discount = 0;
    }
}
