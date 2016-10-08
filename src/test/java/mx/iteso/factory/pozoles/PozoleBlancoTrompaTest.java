package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleBlancoTrompaTest {
    public PozoleBlancoTrompa pozoleBlancoTrompa;

    @Before
    public void setUp() {
        pozoleBlancoTrompa = new PozoleBlancoTrompa();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleBlancoTrompa.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Blanco con Trompa", pozoleBlancoTrompa.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Blanco", pozoleBlancoTrompa.broth);
    }
}