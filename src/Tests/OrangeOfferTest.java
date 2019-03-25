package Tests;

import ShoppingCart.IOffer;
import ShoppingCart.ItemFactory;
import ShoppingCart.OrangeOffer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrangeOfferTest {

    @Test
    void testNoDiscountForApples() {
        IOffer offer = new OrangeOffer();
        MockItem apple = new MockItem(30, ItemFactory.APPLE);
        offer.addItem(apple);
        offer.addItem(apple);
        offer.addItem(apple);
        offer.addItem(apple);
        assertEquals(0, offer.getDiscount());
    }

    @Test
    void testDiscountForOranges() {
        IOffer offer = new OrangeOffer();
        MockItem orange = new MockItem(30, ItemFactory.ORANGE);
        offer.addItem(orange);
        assertEquals(0, offer.getDiscount());
        offer.addItem(orange);
        assertEquals(0, offer.getDiscount());
        offer.addItem(orange);
        assertEquals(30, offer.getDiscount());
        offer.addItem(orange);
        assertEquals(30, offer.getDiscount());
    }
}