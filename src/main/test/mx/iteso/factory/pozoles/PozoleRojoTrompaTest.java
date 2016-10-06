package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoTrompaTest {
    public PozoleRojoTrompa pozoleRojoTrompa;

    public void setUp() {
        pozoleRojoTrompa = new PozoleRojoTrompa();
    }

    public void testToppings() {
        assertEquals(pozoleRojoTrompa.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Rojo con Trompa", pozoleRojoTrompa.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoTrompa.broth);
    }
}