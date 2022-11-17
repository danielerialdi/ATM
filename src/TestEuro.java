import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEuro {
    @Test
    public void testGetValore() {

    }

    @Test
    public void testMinoreDi() {

    }

    @Test
    public void testSomma() {

    }

    @Test
    public void testSottrai() {
        // Creating two different Euro objects 
        Euro euro1 = new Euro(1);
        Euro euro2 = new Euro(2);
        // Using assertEquals to test the function "sottrai"
        // The result has to be multiplied per 100 because of how the function is written
        assertEquals(100, euro2.sottrai(euro1).getValore());
    }

    @Test
    public void testStampa() {
        // Creating an Euro object 
        Euro euro1 = new Euro(1);
        // Using assertEquals to test the function "stampa"
        assertEquals("1.0 euro", euro1.stampa());
    }

    @Test
    public void testUgualeA() {
        // Creating two different Euro objects 
        Euro euro1 = new Euro(1);
        Euro euro2 = new Euro(1);
        // Using assertTrue to test the function "ugualeA"
        assertTrue(euro1.ugualeA(euro2));
    }
}
