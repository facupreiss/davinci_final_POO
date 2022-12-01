package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    public EtapaMundial() {
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void addPartido (Partido partido) {
        getPartidos().add(partido);
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public abstract ArrayList<Equipo> getEquiposQueAvanzan ();


}
