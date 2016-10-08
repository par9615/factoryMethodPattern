package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class PozoleVerdeStoreTest {
    public PozoleVerdeStore pozoleVerdeStore;
    public Pozole pozole;
    public static String POLLO = "pollo";
    public static String CACHETE = "cachete";
    public static String OREJA = "oreja";
    public static String PIERNA = "pierna";
    public static String TROMPA = "trompa";
    public static String NONE = "none";

    @Before
    public void setUp(){
        pozoleVerdeStore = new PozoleVerdeStore();
    }

    @Test
    public void testPozoleVerdePollo() {
        pozole = pozoleVerdeStore.createPozole(POLLO);
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void testPozoleVerdeCachete() {
        pozole = pozoleVerdeStore.createPozole(CACHETE);
        assertEquals("Pozole Verde con Cachete", pozole.getName());
    }

    @Test
    public void testPozoleVerdeOreja() {
        pozole = pozoleVerdeStore.createPozole(OREJA);
        assertEquals("Pozole Verde con Oreja", pozole.getName());
    }

    @Test
    public void testPozoleVerdeTrompa() {
        pozole = pozoleVerdeStore.createPozole(TROMPA);
        assertEquals("Pozole Verde con Trompa", pozole.getName());
    }

    @Test
    public void testCaldoVerde() {
        pozole = pozoleVerdeStore.createPozole(TROMPA);
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void testNone() {
        pozole = pozoleVerdeStore.createPozole(NONE);
        assertEquals(null,pozole);
    }

}