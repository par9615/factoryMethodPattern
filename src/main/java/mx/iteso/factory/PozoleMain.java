package mx.iteso.factory;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import mx.iteso.factory.stores.*;

public class PozoleMain {
    public static void main (String[] args) {
        AllPozolesStore allPozoles = new AllPozolesStore();


        Pozole pozole = allPozoles.createPozole("verde","pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = allPozoles.createPozole("rojo","pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = allPozoles.createPozole("menudo","pollo");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = allPozoles.createPozole("pozolillo","cachete");
        System.out.println("Fourth order is: "+ pozole.getName());
    }
}