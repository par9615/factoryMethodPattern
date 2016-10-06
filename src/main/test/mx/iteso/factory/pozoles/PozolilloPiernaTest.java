package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloPiernaTest {
    public PozolilloPierna pozolilloPierna;

    public void setUp() {
        pozolilloPierna = new PozolilloPierna();
    }

    public void testToppings() {
        assertEquals(pozolilloPierna.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozolillo con Pierna", pozolilloPierna.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloPierna.broth);
    }
}