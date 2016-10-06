package mx.iteso.factory;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import mx.iteso.factory.stores.*;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore allPozoles = new AllPozolesStore();
        PozoleStore menuderia = new MenudoStore();
        PozoleStore blancoStore = new PozoleBlancoStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore pozolilloStore = new PozolilloStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = pozolilloStore.orderPozole("cachete");
        System.out.println("Fourth order is: "+ pozole.getName());
    }
}