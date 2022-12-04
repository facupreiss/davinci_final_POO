package mundial;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntaje;

    public Equipo(String nombre) {
        this.setNombre(nombre);
        this.setPuntaje(0);
        this.setPartidosJugados(new ArrayList<Partido>(0));
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje += puntaje;
    }

    @Override
    public String toString() {
        return  nombre + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
