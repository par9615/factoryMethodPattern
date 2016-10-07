package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class MenudoTest {
    public Menudo menudo;

    @Before
    public void setUp() {
        menudo = new Menudo();
    }

    @Test
    public void testToppings() {
        assertEquals(3,menudo.toppings.size(),0);
    }

    @Test
    public void testName() {
        assertEquals("Menudo",menudo.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Rojo", menudo.broth);
    }
}
