package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloOrejaTest {
    public PozolilloOreja pozolilloOreja;

    public void setUp() {
        pozolilloOreja = new PozolilloOreja();
    }

    public void testToppings() {
        assertEquals(pozolilloOreja.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozolillo con Oreja", pozolilloOreja.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloOreja.broth);
    }
}