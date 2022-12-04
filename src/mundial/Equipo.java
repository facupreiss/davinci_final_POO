package mundial;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntaje;

    public Equipo(String nombre, int puntaje) {
        this.setNombre(nombre);
        this.setPuntaje(0);
    }

    public Equipo(String nombre, int puntaje, ArrayList<Partido> partidosJugados) {
        this.setNombre(nombre);
        this.setPuntaje(0);
        this.setPartidosJugados(partidosJugados);
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
        this.puntaje = puntaje;
    }
}
