import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEuro {
    @Test
    public void testGetValore() {
        Euro euro = new Euro(2);
        assertEquals(euro.getValore(), 200);
        //we simply create a euro object and remembering that euro.valore() is 100 times the
        //value that we pass to the constructor we write the test
    }

    @Test
    public void testMinoreDi() {
        Euro euro = new Euro(1); 
        Euro euro1 = new Euro(2); //we create two euro objects and make sure one's value is bigger than the other's
        assertTrue(euro.minoreDi(euro1));
        //we write the test by asserting that the function should recognize the bigger one
    }

    @Test
    public void testSomma() {
        Euro euro1 = new Euro(1); 
        Euro euro2 = new Euro(2); //create two different Euro objects in order to test somma
        assertEquals(300, euro2.somma(euro1).getValore()); 
        //remembering that euro.valore() is 100 times the double we pass to the constructor we write the test
    }

    @Test
    public void testSottrai() {

    }

    @Test
    public void testStampa() {

    }

    @Test
    public void testUgualeA() {

    }
}
