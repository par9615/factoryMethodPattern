package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by simio on 05/10/2016.
 */
public class AllPozolesStore extends PozoleStore {
    PozoleStore verdeStore;
    PozoleStore rojoStore;
    PozoleStore menuderia;
    PozoleStore pozolilloStore;
    PozoleStore blancoStore;

    public AllPozolesStore() {
        verdeStore = new PozoleVerdeStore();
        rojoStore = new PozoleRojoStore();
        menuderia = new MenudoStore();
        pozolilloStore = new PozolilloStore();
        blancoStore = new PozoleBlancoStore();
    }

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
