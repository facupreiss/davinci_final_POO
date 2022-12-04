package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {

    public Grupo(String descripcionEtapa) {
        super(descripcionEtapa);
        this.setPartidos(new ArrayList<Partido>(0));
    }


    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return null;
    //HAY QUE HACER ESTE METODO
    }

}
