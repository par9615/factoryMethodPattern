package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Erick on 08/10/2016.
 */
public class MenudoStoreTest {
    public MenudoStore menudoStore;
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

    @Before
    public void setup(){
        menudoStore = new MenudoStore();
    }

    @Test
    public void testMenudo() {
        pozole = menudoStore.createPozole(CACHETE);
        assertEquals("Menudo", pozole.getName());
    }
}