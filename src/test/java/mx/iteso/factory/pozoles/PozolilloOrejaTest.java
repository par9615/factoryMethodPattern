package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozolilloOrejaTest {
    public PozolilloOreja pozolilloOreja;

    @Before
    public void setUp() {
        pozolilloOreja = new PozolilloOreja();
    }

    @Test
    public void testToppings() {
        assertEquals(pozolilloOreja.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozolillo con Oreja", pozolilloOreja.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozolilloOreja.broth);
    }
}