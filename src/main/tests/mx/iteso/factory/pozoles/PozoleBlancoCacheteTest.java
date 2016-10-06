package mx.iteso.factory.pozoles;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoCacheteTest {
    public PozoleBlancoCachete pozoleBlancoCachete;

    public void setUp() {
        pozoleBlancoCachete = new PozoleBlancoCachete();
    }

    public void testToppings() {
        assertEquals(pozoleBlancoCachete.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Blanco con Cachete", pozoleBlancoCachete.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoCachete.broth);
    }
}
