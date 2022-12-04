package mundial;

import java.util.ArrayList;

public class Grupo extends EtapaMundial {

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
    }

    @Override
    public  ArrayList<Equipo> getEquiposQueAvanzan() {
        return null;
    //HAY QUE HACER ESTE METODO
    }

}
