package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by simio on 05/10/2016.
 */
public class PozoleBlancoTrompa extends Pozole {
    public PozoleBlancoTrompa() {
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
