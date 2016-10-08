package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoPolloTest {
    public PozoleBlancoPollo pozoleBlancoPollo;

    @Before
    public void setUp() {
        pozoleBlancoPollo = new PozoleBlancoPollo();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleBlancoPollo.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Pollo", pozoleBlancoPollo.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoPollo.broth);
    }
}