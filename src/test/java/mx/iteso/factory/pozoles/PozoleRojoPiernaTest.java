package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleRojoPiernaTest {
    public PozoleRojoPierna pozoleRojoPierna;

    @Before
    public void setUp() {
        pozoleRojoPierna = new PozoleRojoPierna();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleRojoPierna.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Rojo con Pierna", pozoleRojoPierna.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", pozoleRojoPierna.broth);
    }
}