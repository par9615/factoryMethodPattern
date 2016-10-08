package mx.iteso.factory;

import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Erick on 05/10/2016.
 */
public class PozoleTest {
    public Pozole pozole;
    public PozoleStore pozoleStore;

    @Before
    public void setUp() {
        pozoleStore = new PozoleVerdeStore();
        pozole = pozoleStore.orderPozole("pollo");
    }

    @Test
    public void testPozoleCreated() {
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }
}
