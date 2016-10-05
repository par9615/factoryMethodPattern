package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by simio on 05/10/2016.
 */
public class PozoleBlancoPierna extends Pozole {
    public PozoleBlancoPierna() {
        name = "Pozole Blanco con Pierna";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
