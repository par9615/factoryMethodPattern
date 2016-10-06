package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloCacheteTest {
    public PozolilloCachete pozolilloCachete;

    public void setUp() {
        pozolilloCachete = new PozolilloCachete();
    }

    public void testToppings() {
        assertEquals(pozolilloCachete.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozolillo con Cachete", pozolilloCachete.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloCachete.broth);
    }
}