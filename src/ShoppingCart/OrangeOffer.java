package ShoppingCart;

public class OrangeOffer extends OfferBase {
    public OrangeOffer() {
        super(ItemFactory.ORANGE);
    }

    @Override
    public void doAddItem(IItem item) {
        int count = getCount();
        if (count == 0 || count == 1) {
            count++;
        } else {
            count = 0;
            addDiscount(item.getPrice());
        }
        setCount(count);
    }
}
