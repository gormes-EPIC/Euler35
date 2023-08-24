import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class EulerTester {
    @Test
    public void testGivens() {
        assertEquals(23, Euler.multiplesThreesFives(10));
        assertEquals(2318, Euler.multiplesThreesFives(100));
    }

    @Test
    public void testEdges() {
        assertEquals(0, Euler.multiplesThreesFives(1));
        assertEquals(0, Euler.multiplesThreesFives(2));
        assertEquals(0, Euler.multiplesThreesFives(3));
        assertEquals(3, Euler.multiplesThreesFives(5));
    }



}
