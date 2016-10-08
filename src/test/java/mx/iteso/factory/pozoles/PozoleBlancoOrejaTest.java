package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoOrejaTest {
    public PozoleBlancoOreja pozoleBlancoOreja;

    @Before
    public void setUp() {
        pozoleBlancoOreja = new PozoleBlancoOreja();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleBlancoOreja.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Oreja", pozoleBlancoOreja.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoOreja.broth);
    }
}