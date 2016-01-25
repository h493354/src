import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestTest {

    @Test
    public void testSimple() {
        assertEquals(9, Largest.largest(new int[] {7,8,9}));
    }

    @Test
    public void testNegative() {
        assertEquals(-7, Largest.largest(new int[] {-7,-8,-9}));
    }

    @Test
    public void testOne() {
        assertEquals(9, Largest.largest(new int[] {9}));
    }

    @Test
    public void testOrder() {
        assertEquals(9, Largest.largest(new int[] {7,8,9}));
        assertEquals(9, Largest.largest(new int[] {9,8,7}));
    }

}
