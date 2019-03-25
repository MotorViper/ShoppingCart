package ShoppingCart;

public class OrangeOffer implements IOffer {
    private int _count = 0;
    private int _discount;

    @Override
    public void addItem(IItem item) {
        if (item.getID() == ItemFactory.ORANGE) {
            if (_count == 0 || _count == 1) {
                _count++;
            } else {
                _count = 0;
                _discount += item.getPrice();
            }
        }
    }

    @Override
    public int getDiscount() {
        return _discount;
    }

    @Override
    public void reset() {
        _count = 0;
        _discount = 0;
    }
}
