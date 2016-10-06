package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoPiernaTest {
    public PozoleBlancoPierna pozoleBlancoPierna;

    public void setUp() {
        pozoleBlancoPierna = new PozoleBlancoPierna();
    }

    public void testToppings() {
        assertEquals(pozoleBlancoPierna.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Blanco con Pierna", pozoleBlancoPierna.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoPierna.broth);
    }
}