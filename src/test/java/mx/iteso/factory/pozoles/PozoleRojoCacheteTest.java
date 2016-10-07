package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoCacheteTest {
    public PozoleRojoCachete pozoleRojoCachete;

    @Before
    public void setUp() {
        pozoleRojoCachete = new PozoleRojoCachete();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleRojoCachete.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Rojo con Cachete", pozoleRojoCachete.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoCachete.broth);
    }
}