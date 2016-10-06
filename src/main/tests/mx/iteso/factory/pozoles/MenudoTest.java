package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class MenudoTest {
    public Menudo menudo;

    public void setUp() {
        menudo = new Menudo();
    }

    public void testToppings() {
        assertEquals(3,menudo.toppings.size(),0);
    }

    public void testName() {
        assertEquals("Menudo",menudo.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Rojo", menudo.broth);
    }
}
