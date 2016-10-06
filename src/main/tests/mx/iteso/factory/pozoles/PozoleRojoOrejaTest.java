package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoOrejaTest {
    public PozoleRojoOreja pozoleRojoOreja;

    public void setUp() {
        pozoleRojoOreja = new PozoleRojoOreja();
    }

    public void testToppings() {
        assertEquals(pozoleRojoOreja.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Rojo con Oreja", pozoleRojoOreja.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoOreja.broth);
    }
}