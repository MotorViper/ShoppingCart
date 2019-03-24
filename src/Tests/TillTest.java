package Tests;

import ShoppingCart.IItem;
import ShoppingCart.ITill;
import ShoppingCart.Till;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Till class.
 */
class TillTest {

    @Test
    void sum() {
        var orange = new MockItem(25);
        var apple = new MockItem(60);
        ITill till = new Till();
        till.addItem(apple);
        till.addItem(apple);
        till.addItem(orange);
        till.addItem(apple);
        assertEquals(205, till.sum());
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