package mundial;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal () {
        boolean ganoLocal;

        if (getGolesLocal()>golesVisitante){
            ganoLocal = true;
            System.out.println("Gano el equipo local");

    } else if (getGolesLocal()<golesVisitante){
            ganoLocal = false;
            System.out.println("Gano el equipo visitante");
    }
        return ganoLocal;
    }

    public boolean empate () {
        boolean empate = false;
        if (getGolesLocal()==golesVisitante){
            empate = true;
            System.out.println("Gano el equipo local");
        }
        return empate;
    }

}
