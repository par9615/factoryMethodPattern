package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class PozoleRojoStoreTest {
    public PozoleRojoStore pozoleRojoStore;
    public Pozole pozole;
    public static String POLLO = "pollo";
    public static String CACHETE = "cachete";
    public static String OREJA = "oreja";
    public static String PIERNA = "pierna";
    public static String TROMPA = "trompa";
    public static String NONE = "none";

    @Before
    public void setUp(){
        pozoleRojoStore = new PozoleRojoStore();
    }

    @Test
    public void testPozoleRojoPollo() {
        pozole = pozoleRojoStore.createPozole(POLLO);
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void testPozoleRojoCachete() {
        pozole = pozoleRojoStore.createPozole(CACHETE);
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void testPozoleRojoOreja() {
        pozole = pozoleRojoStore.createPozole(OREJA);
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void testPozoleRojoTrompa() {
        pozole = pozoleRojoStore.createPozole(TROMPA);
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }

    @Test
    public void testCaldoRojo() {
        pozole = pozoleRojoStore.createPozole(TROMPA);
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void testNone() {
        pozole = pozoleRojoStore.createPozole(NONE);
        assertEquals(null,pozole);
    }
}