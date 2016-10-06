package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoPolloTest {
    public PozoleRojoPollo pozoleRojoPollo;

    public void setUp() {
        pozoleRojoPollo = new PozoleRojoPollo();
    }

    public void testToppings() {
        assertEquals(pozoleRojoPollo.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Rojo con Pollo", pozoleRojoPollo.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoPollo.broth);
    }
}