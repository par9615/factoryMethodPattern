package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdePolloTest {
    public PozoleVerdePollo pozoleVerdePollo;

    @Before
    public void setUp() {
        pozoleVerdePollo = new PozoleVerdePollo();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleVerdePollo.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Verde con Pollo", pozoleVerdePollo.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdePollo.broth);
    }
}