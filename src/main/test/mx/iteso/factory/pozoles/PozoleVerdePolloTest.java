package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdePolloTest {
    public PozoleVerdePollo pozoleVerdePollo;

    public void setUp() {
        pozoleVerdePollo = new PozoleVerdePollo();
    }

    public void testToppings() {
        assertEquals(pozoleVerdePollo.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Verde con Pollo", pozoleVerdePollo.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdePollo.broth);
    }
}