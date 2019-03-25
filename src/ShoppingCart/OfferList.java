package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class OfferList implements IOfferList {
    private final List<IOffer> _offers = new ArrayList<IOffer>();

    @Override
    public void addItem(IItem item) {
        for (IOffer offer: _offers) {
            offer.addItem(item);
        }
    }

    @Override
    public void addOffer(IOffer offer) {
        _offers.add(offer);
    }

    @Override
    public int getDiscount() {
        int discount = 0;
        for (IOffer offer: _offers) {
            discount += offer.getDiscount();
        }
        return discount;
    }

    @Override
    public void reset() {
        for (IOffer offer: _offers) {
            offer.reset();
        }
    }
}
