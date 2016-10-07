package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoCacheteTest {
    public PozoleBlancoCachete pozoleBlancoCachete;

    @Before
    public void setUp() {
        pozoleBlancoCachete = new PozoleBlancoCachete();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleBlancoCachete.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Cachete", pozoleBlancoCachete.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoCachete.broth);
    }
}
