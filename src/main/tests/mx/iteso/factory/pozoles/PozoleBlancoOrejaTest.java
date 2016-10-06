package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoOrejaTest {
    public PozoleBlancoOreja pozoleBlancoOreja;

    public void setUp() {
        pozoleBlancoOreja = new PozoleBlancoOreja();
    }

    public void testToppings() {
        assertEquals(pozoleBlancoOreja.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Blanco con Oreja", pozoleBlancoOreja.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoOreja.broth);
    }
}