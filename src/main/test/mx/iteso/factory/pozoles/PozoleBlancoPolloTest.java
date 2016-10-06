package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoPolloTest {
    public PozoleBlancoPollo pozoleBlancoPollo;

    public void setUp() {
        pozoleBlancoPollo = new PozoleBlancoPollo();
    }

    public void testToppings() {
        assertEquals(pozoleBlancoPollo.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Blanco con Pollo", pozoleBlancoPollo.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoPollo.broth);
    }
}