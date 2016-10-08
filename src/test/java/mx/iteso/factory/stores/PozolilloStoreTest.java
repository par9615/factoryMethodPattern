package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class PozolilloStoreTest {
    public PozolilloStore pozolilloStore;
    public Pozole pozole;
    public static String POLLO = "pollo";
    public static String CACHETE = "cachete";
    public static String OREJA = "oreja";
    public static String PIERNA = "pierna";
    public static String TROMPA = "trompa";
    public static String NONE = "none";

    @Before
    public void setUp(){
        pozolilloStore = new PozolilloStore();
    }

    @Test
    public void testPozolilloPollo() {
        pozole = pozolilloStore.createPozole(POLLO);
        assertEquals("Pozolillo con Pollo", pozole.getName());
    }

    @Test
    public void testPozolilloCachete() {
        pozole = pozolilloStore.createPozole(CACHETE);
        assertEquals("Pozolillo con Cachete", pozole.getName());
    }

    @Test
    public void testPozolilloOreja() {
        pozole = pozolilloStore.createPozole(OREJA);
        assertEquals("Pozolillo con Oreja", pozole.getName());
    }

    @Test
    public void testPozolilloTrompa() {
        pozole = pozolilloStore.createPozole(TROMPA);
        assertEquals("Pozolillo con Trompa", pozole.getName());
    }

    @Test
    public void testCaldoVerde() {
        pozole = pozolilloStore.createPozole(TROMPA);
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void testNone() {
        pozole = pozolilloStore.createPozole(NONE);
        assertEquals(null,pozole);
    }
}