package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoPiernaTest {
    public PozoleBlancoPierna pozoleBlancoPierna;

    @Before
    public void setUp() {
        pozoleBlancoPierna = new PozoleBlancoPierna();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleBlancoPierna.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Pierna", pozoleBlancoPierna.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoPierna.broth);
    }
}