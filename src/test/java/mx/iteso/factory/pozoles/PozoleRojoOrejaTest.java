package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoOrejaTest {
    public PozoleRojoOreja pozoleRojoOreja;

    @Before
    public void setUp() {
        pozoleRojoOreja = new PozoleRojoOreja();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleRojoOreja.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Rojo con Oreja", pozoleRojoOreja.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoOreja.broth);
    }
}