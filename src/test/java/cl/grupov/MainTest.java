package cl.grupov;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    private final Main main = new Main();

    @Test
    public void suma() {
        assertEquals(4, main.suma(2, 2));
        assertEquals(0, main.suma(-1, 1));
        assertEquals(-3, main.suma(25, -28));
        assertEquals(-9, main.suma(-5, -4));
    }

    @Test
    public void resta() {
        assertEquals(5, main.resta(8, 3));
        assertEquals(-33, main.resta(-30, 3));
        assertEquals(46, main.resta(40, -6));
        assertEquals(0, main.resta(-20, -20));
    }
}