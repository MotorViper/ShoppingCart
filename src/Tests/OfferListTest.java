package Tests;

import ShoppingCart.OfferList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfferListTest {

    @Test
    void testAddOfferAndGetDiscount() {
        OfferList offers = new OfferList();
        offers.addOffer(new MockOffer(20));
        offers.addOffer(new MockOffer(25));
        assertEquals(45, offers.getDiscount());
    }

    @Test
    void testReset() {
        OfferList offers = new OfferList();
        offers.addOffer(new MockOffer(10));
        assertEquals(10, offers.getDiscount());
        offers.reset();
        assertEquals(0, offers.getDiscount());
    }
}