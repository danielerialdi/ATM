import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Business_logic.Euro;
import Database.BankDatabase;

public class BankDatabaseTest {
    BankDatabase bankdatabase;
    Euro euro12, euro2, euro24, euro10;
    @Before
    public void setup(){
        bankdatabase = new BankDatabase();
        euro12 = new Euro(1200);
        euro10 = new Euro(1000);
        euro2 = new Euro(200);
        euro24 = new Euro(2400);
    }
    @Test
    public void testAuthenticateUser() {
        assertTrue(bankdatabase.authenticateUser(12345, 54321));
    }

    @Test
    public void testCredit() {
        bankdatabase.credit(12345, euro12);
        assertEquals(euro24.getValore(), bankdatabase.getTotalBalance(12345).getValore());
    }

    @Test
    public void testDebit() {
        bankdatabase.debit(12345, euro10);
        assertEquals(euro2.getValore(), bankdatabase.getTotalBalance(12345).getValore());
    }

    @Test
    public void testGetAvailableBalance() {
        assertEquals(euro2.getValore(), bankdatabase.getAvailableBalance(98765).getValore());
    }

    @Test
    public void testGetTotalBalance() {
        assertEquals(euro12.getValore(), bankdatabase.getTotalBalance(12345).getValore());
    }
}
