package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeCacheteTest {
    public PozoleVerdeCachete pozoleVerdeCachete;

    @Before
    public void setUp() {
        pozoleVerdeCachete = new PozoleVerdeCachete();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleVerdeCachete.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Verde con Cachete", pozoleVerdeCachete.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeCachete.broth);
    }
}