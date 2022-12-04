package mundial;

import java.util.ArrayList;

public class Llave extends EtapaMundial{

    public Llave(String descripcionEtapa) {
        super(descripcionEtapa);
        this.setPartidos(new ArrayList<Partido>(0));
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return null;
    //HAY QUE HACER ESTE METODO
    }

}
