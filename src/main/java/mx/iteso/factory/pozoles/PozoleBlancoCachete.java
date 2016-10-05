package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by simio on 05/10/2016.
 */
public class PozoleBlancoCachete extends Pozole {
    public PozoleBlancoCachete() {
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
