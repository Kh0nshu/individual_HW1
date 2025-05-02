package average;

import static org.junit.Assert.*;
import org.junit.Test;

public class AverageTest {

    @Test
    public void testNormalCase() {
        Average avg = new Average();
        assertEquals(6, avg.average(3, new int[]{3, 6, 9, 12}));
    }

    @Test
    public void testKGreaterThanLength() {
        Average avg = new Average();
        assertEquals(2, avg.average(5, new int[]{1, 2, 3}));
    }

    @Test
    public void testEmptyArray() {
        Average avg = new Average();
        assertEquals(0, avg.average(0, new int[]{}));
    }

    @Test
    public void testNegativeNumbers() {
        Average avg = new Average();
        assertEquals(-5, avg.average(2, new int[]{-4, -6}));
    }

    @Test
    public void testBoundary() {
        Average avg = new Average();
        assertEquals(10, avg.average(3, new int[]{10, 10, 10}));
    }
}


