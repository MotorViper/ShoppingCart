package ShoppingCart;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of ITill.
 */
public class Till implements ITill {
    private int _sum = 0;
    private IOfferList _offers;

    @Override
    public void addItem(IItem item) {
        _sum += item.getPrice();
        if (_offers != null)
            _offers.addItem(item);
    }

    @Override
    public void addItems(Iterable<IItem> items) {
        for (IItem item: items) {
            addItem(item);
        }
    }

    public void setOfferList(IOfferList offers) {
        _offers = offers;
    }

    @Override
    public int sum() {
        if (_offers != null)
            _sum -= _offers.getDiscount();
        return _sum;
    }
    
    @Override
    public void reset() {
        _sum = 0;
        if (_offers != null)
            _offers.reset();
    }
}
