package mx.iteso.factory.pozoles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleVerdeTrompaTest {
    public PozoleVerdeTrompa pozoleVerdeTrompa;

    @Before
    public void setUp() {
        pozoleVerdeTrompa = new PozoleVerdeTrompa();
    }

    @Test
    public void testToppings() {
        assertEquals(pozoleVerdeTrompa.toppings.size(),3,0);
    }

    @Test
    public void testName() {
        assertEquals("Pozole Verde con Trompa", pozoleVerdeTrompa.getName());
    }

    @Test
    public void testCaldo() {
        assertEquals("Caldo Verde", pozoleVerdeTrompa.broth);
    }
}