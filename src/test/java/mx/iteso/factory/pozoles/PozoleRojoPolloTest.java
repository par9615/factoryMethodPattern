package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoPolloTest {
    public PozoleRojoPollo pozoleRojoPollo;

    @Before
    public void setUp() {
        pozoleRojoPollo = new PozoleRojoPollo();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleRojoPollo.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Rojo con Pollo", pozoleRojoPollo.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoPollo.broth);
    }
}