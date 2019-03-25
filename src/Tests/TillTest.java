package Tests;

import ShoppingCart.IItem;
import ShoppingCart.ITill;
import ShoppingCart.Till;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void reset() {
        IItem item = new MockItem(10);
        ITill till = new Till();
        till.addItem(item);
        assertEquals(10, till.sum());
        till.reset();
        assertEquals(0, till.sum());
    }
}