package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloCacheteTest {
    public PozolilloCachete pozolilloCachete;

    @Before
    public void setUp() {
        pozolilloCachete = new PozolilloCachete();
    }

    @Test
    public void testToppings() {
        assertEquals(pozolilloCachete.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozolillo con Cachete", pozolilloCachete.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloCachete.broth);
    }
}