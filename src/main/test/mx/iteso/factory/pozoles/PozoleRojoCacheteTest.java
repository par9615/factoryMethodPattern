package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoCacheteTest {
    public PozoleRojoCachete pozoleRojoCachete;

    public void setUp() {
        pozoleRojoCachete = new PozoleRojoCachete();
    }

    public void testToppings() {
        assertEquals(pozoleRojoCachete.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Rojo con Cachete", pozoleRojoCachete.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoCachete.broth);
    }
}