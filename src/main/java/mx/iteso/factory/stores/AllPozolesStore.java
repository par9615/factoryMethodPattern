package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by simio on 05/10/2016.
 */
public class AllPozolesStore extends PozoleStore {
    PozoleStore verdeStore = new PozoleVerdeStore();
    PozoleStore rojoStore = new PozoleRojoStore();
    PozoleStore menuderia = new MenudoStore();
    PozoleStore pozolilloStore = new PozolilloStore();
    PozoleStore blancoStore = new PozoleBlancoStore();

    protected Pozole createPozole(String type, String meat){
        if(type == "verde")
            return verdeStore.orderPozole(meat);
        else if(type == "rojo")
            return rojoStore.orderPozole(meat);
        else if(type == "menudo")
            return menuderia.orderPozole(meat);
        else if(type == "pozolillo")
            return pozolilloStore.orderPozole(meat);
        else if(type == "blanco")
            return blancoStore.orderPozole(meat);
        else
            return null;
    }

    protected Pozole createPozole(String meat) {
        return null;
    }
}
