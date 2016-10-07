package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloPolloTest {
    public PozolilloPollo pozolilloCachete;

    @Before
    public void setUp() {
        pozolilloCachete = new PozolilloPollo();
    }

    @Test
    public void testToppings() {
        assertEquals(pozolilloCachete.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozolillo con Pollo", pozolilloCachete.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloCachete.broth);
    }
}