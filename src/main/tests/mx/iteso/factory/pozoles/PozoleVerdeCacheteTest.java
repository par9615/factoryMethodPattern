package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeCacheteTest {
    public PozoleVerdeCachete pozoleVerdeCachete;

    public void setUp() {
        pozoleVerdeCachete = new PozoleVerdeCachete();
    }

    public void testToppings() {
        assertEquals(pozoleVerdeCachete.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Verde con Cachete", pozoleVerdeCachete.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeCachete.broth);
    }
}