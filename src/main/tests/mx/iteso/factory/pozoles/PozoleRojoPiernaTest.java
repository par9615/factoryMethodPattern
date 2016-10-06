package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoPiernaTest {
    public PozoleRojoPierna pozoleRojoPierna;

    public void setUp() {
        pozoleRojoPierna = new PozoleRojoPierna();
    }

    public void testToppings() {
        assertEquals(pozoleRojoPierna.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Rojo con Pierna", pozoleRojoPierna.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoPierna.broth);
    }
}