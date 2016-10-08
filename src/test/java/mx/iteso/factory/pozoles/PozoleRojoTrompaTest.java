package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoTrompaTest {
    public PozoleRojoTrompa pozoleRojoTrompa;

    @Before
    public void setUp() {
        pozoleRojoTrompa = new PozoleRojoTrompa();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleRojoTrompa.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Rojo con Trompa", pozoleRojoTrompa.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoTrompa.broth);
    }
}