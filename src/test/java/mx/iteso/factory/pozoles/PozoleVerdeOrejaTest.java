package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeOrejaTest {
    public PozoleVerdeOreja pozoleVerdeOreja;

    @Before
    public void setUp() {
        pozoleVerdeOreja = new PozoleVerdeOreja();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleVerdeOreja.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Verde con Oreja", pozoleVerdeOreja.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeOreja.broth);
    }
}