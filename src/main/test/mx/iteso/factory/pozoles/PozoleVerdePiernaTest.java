package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdePiernaTest {
    public PozoleVerdePierna pozoleVerdePierna;

    public void setUp() {
        pozoleVerdePierna = new PozoleVerdePierna();
    }

    public void testToppings() {
        assertEquals(pozoleVerdePierna.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Verde con Pierna", pozoleVerdePierna.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdePierna.broth);
    }
}