package mx.iteso.factory.pozoles;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeTrompaTest {
    public PozoleVerdeTrompa pozoleVerdeTrompa;

    public void setUp() {
        pozoleVerdeTrompa = new PozoleVerdeTrompa();
    }

    public void testToppings() {
        assertEquals(pozoleVerdeTrompa.toppings.size(),3,0);
    }

    public void testName() {
        assertEquals("Pozole Verde con Trompa", pozoleVerdeTrompa.getName());
    }

    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeTrompa.broth);
    }
}