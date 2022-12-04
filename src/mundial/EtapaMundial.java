package mundial;

import java.util.ArrayList;

public abstract class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    //CONSTRUCTOR
    public EtapaMundial() {
    }

    public EtapaMundial(String descripcionEtapa) {
        setDescripcionEtapa(descripcionEtapa);
        setPartidos(new ArrayList<Partido>(0));
    }

    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() { return partidos;    }

    public void addPartido (Partido partido) {
        getPartidos().add(partido);
    }

    public abstract ArrayList<Equipo> getEquiposQueAvanzan ();



}
