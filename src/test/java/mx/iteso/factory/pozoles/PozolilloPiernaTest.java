package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloPiernaTest {
    public PozolilloPierna pozolilloPierna;

    @Before
    public void setUp() {
        pozolilloPierna = new PozolilloPierna();
    }

    @Test
    public void testToppings() {
        assertEquals(pozolilloPierna.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozolillo con Pierna", pozolilloPierna.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloPierna.broth);
    }
}