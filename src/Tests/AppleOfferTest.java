package Tests;

import ShoppingCart.AppleOffer;
import ShoppingCart.IOffer;
import ShoppingCart.ItemFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleOfferTest {

    @Test
    void testNoDiscountForOranges() {
        IOffer offer = new AppleOffer();
        MockItem orange = new MockItem(30, ItemFactory.ORANGE);
        offer.addItem(orange);
        offer.addItem(orange);
        offer.addItem(orange);
        offer.addItem(orange);
        assertEquals(0, offer.getDiscount());
    }

    @Test
    void testDiscountForApples() {
        IOffer offer = new AppleOffer();
        MockItem apple = new MockItem(40, ItemFactory.APPLE);
        offer.addItem(apple);
        assertEquals(0, offer.getDiscount());
        offer.addItem(apple);
        assertEquals(40, offer.getDiscount());
        offer.addItem(apple);
        assertEquals(40, offer.getDiscount());
        offer.addItem(apple);
        assertEquals(80, offer.getDiscount());
    }
}