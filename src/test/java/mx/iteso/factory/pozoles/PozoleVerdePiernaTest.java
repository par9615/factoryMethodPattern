package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdePiernaTest {
    public PozoleVerdePierna pozoleVerdePierna;

    @Before
    public void setUp() {
        pozoleVerdePierna = new PozoleVerdePierna();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleVerdePierna.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Verde con Pierna", pozoleVerdePierna.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdePierna.broth);
    }
}