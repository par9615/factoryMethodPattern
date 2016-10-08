package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class AllPozolesStoreTest {
    public AllPozolesStore allPozolesStore;
    public Pozole pozole;
    public static String VERDE = "verde";
    public static String ROJO = "rojo";
    public static String MENUDO = "menudo";
    public static String POZOLILLO = "pozolillo";
    public static String BLANCO = "blanco";
    public static String POLLO = "pollo";
    public static String CACHETE = "cachete";
    public static String OREJA = "oreja";
    public static String PIERNA = "pierna";
    public static String TROMPA = "trompa";
    public static String NONE = "none";

    @Before
    public void setUp() {
        allPozolesStore = new AllPozolesStore();
    }

    @Test
    public void testPozoleVerde() {
        pozole = allPozolesStore.createPozole(VERDE, POLLO);
        assertEquals("Pozole Verde con Pollo",pozole.getName());
    }

    @Test
    public void testPozoleRojo() {
        pozole = allPozolesStore.createPozole(ROJO, CACHETE);
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void testMenudo() {
        pozole = allPozolesStore.createPozole(MENUDO, ROJO);
        assertEquals("Menudo", pozole.getName());
    }

    @Test
    public void testPozolillo() {
        pozole = allPozolesStore.createPozole(POZOLILLO, OREJA);
        assertEquals("Pozolillo con Oreja", pozole.getName());
    }

    @Test
    public void testPozoleBlanco() {
        pozole = allPozolesStore.createPozole(BLANCO, PIERNA);
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void testNone() {
        pozole = allPozolesStore.createPozole(NONE,NONE);
        assertEquals(null,pozole);
    }
}