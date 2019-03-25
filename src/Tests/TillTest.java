package Tests;

import ShoppingCart.*;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Till class.
 */
class TillTest {
    private final IItem orange = new MockItem(25);
    private final IItem apple = new MockItem(60);

    @Test
    void testAddItemAndSum() {
        ITill till = new Till();
        till.addItem(apple);
        till.addItem(apple);
        till.addItem(orange);
        till.addItem(apple);
        assertEquals(205, till.sum());
    }

    @Test
    void testAddItems() {
        ITill till = new Till();
        till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange)));
        assertEquals(230, till.sum());
    }

    @Test
    void testOffers() {
        ITill till = new Till();
        till.setOfferList(new MockOfferList());
        till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange)));
        assertEquals(180, till.sum());
    }

    @Test
    void reset() {
        IItem item = new MockItem(10);
        ITill till = new Till();
        till.addItem(item);
        assertEquals(10, till.sum());
        till.reset();
        assertEquals(0, till.sum());
    }

    @Test
    void overallTest() {
        try {
            ITill till = new Till();
            IOfferList offers = new OfferList();
            offers.addOffer(new OrangeOffer());
            offers.addOffer(new AppleOffer());
            till.setOfferList(offers);
            IItem orange = ItemFactory.Create("Orange");
            IItem apple = ItemFactory.Create("Apple");
            till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange)));
            assertEquals(170, till.sum());
            till.reset();
            till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange, apple)));
            assertEquals(170, till.sum());
            till.reset();
            till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange, orange)));
            assertEquals(170, till.sum());
            till.reset();
            till.addItems(new ArrayList<>(List.of(apple, apple, orange, apple, orange, orange, orange)));
            assertEquals(195, till.sum());
        } catch (UnexpectedException ex) {
            fail("Exception thrown " + ex.getMessage());
        }
    }
}