package ShoppingCart;

public class AppleOffer extends OfferBase {
    public AppleOffer() {
        super(ItemFactory.APPLE);
    }

    @Override
    public void doAddItem(IItem item) {
        int count = getCount();
        if (count == 0) {
            count = 1;
        } else {
            count = 0;
            addDiscount(item.getPrice());
        }
        setCount(count);
    }
}
