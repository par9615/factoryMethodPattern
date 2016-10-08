package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class PozoleBlancoStoreTest {
    public PozoleBlancoStore pozoleBlancoStore;
    public Pozole pozole;
    public static String POLLO = "pollo";
    public static String CACHETE = "cachete";
    public static String OREJA = "oreja";
    public static String PIERNA = "pierna";
    public static String TROMPA = "trompa";
    public static String NONE = "none";

    @Before
    public void setUp(){
        pozoleBlancoStore = new PozoleBlancoStore();
    }

    @Test
    public void testPozoleBlancoPollo() {
        pozole = pozoleBlancoStore.createPozole(POLLO);
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void testPozoleBlancoCachete() {
        pozole = pozoleBlancoStore.createPozole(CACHETE);
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void testPozoleBlancoOreja() {
        pozole = pozoleBlancoStore.createPozole(OREJA);
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void testPozoleBlancoTrompa() {
        pozole = pozoleBlancoStore.createPozole(TROMPA);
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }

    @Test
    public void testCaldoBlanco() {
        pozole = pozoleBlancoStore.createPozole(TROMPA);
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void testNone() {
        pozole = pozoleBlancoStore.createPozole(NONE);
        assertEquals(null,pozole);
    }
}