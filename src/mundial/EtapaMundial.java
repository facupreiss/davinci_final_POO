package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    //CONSTRUCTOR
    public EtapaMundial() {
        this.partidos = new ArrayList<>();
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
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
