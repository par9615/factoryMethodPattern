package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeOrejaTest {
    public PozoleVerdeOreja pozoleVerdeOreja;

    public void setUp() {
        pozoleVerdeOreja = new PozoleVerdeOreja();
    }

    public void testToppings() {
        assertEquals(pozoleVerdeOreja.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Verde con Oreja", pozoleVerdeOreja.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeOreja.broth);
    }
}