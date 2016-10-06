package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloTrompaTest {
    public PozolilloTrompa pozolilloCachete;

    public void setUp() {
        pozolilloCachete = new PozolilloTrompa();
    }

    public void testToppings() {
        assertEquals(pozolilloCachete.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozolillo con Trompa", pozolilloCachete.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloCachete.broth);
    }
}