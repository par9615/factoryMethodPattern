package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoTrompaTest {
    public PozoleBlancoTrompa pozoleBlancoTrompa;

    public void setUp() {
        pozoleBlancoTrompa = new PozoleBlancoTrompa();
    }

    public void testToppings() {
        assertEquals(pozoleBlancoTrompa.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Blanco con Trompa", pozoleBlancoTrompa.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoTrompa.broth);
    }
}