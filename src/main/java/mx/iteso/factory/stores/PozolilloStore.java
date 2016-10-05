package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by simio on 05/10/2016.
 */
public class PozolilloStore extends PozoleStore {
    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozolilloPollo();
        else if (meat.equals("cachete") )
            return new PozolilloCachete();
        else if (meat.equals("oreja"))
            return new PozolilloOreja();
        else if (meat.equals("pierna") )
            return new PozolilloPierna();
        else if (meat.equals("trompa"))
            return new PozolilloTrompa();
        else return null;
    }
}
