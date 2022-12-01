package mundial;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public Resultado() {

    }

    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal () {
        boolean ganoLocal = true;

        if (getGolesLocal()>getGolesVisitante()){
            ganoLocal = true;
            System.out.println("Gano el equipo local");

    } else if (getGolesLocal()<getGolesVisitante()){
            ganoLocal = false;
            System.out.println("Gano el equipo visitante");
    }
        return ganoLocal;
    }

    public boolean empate () {
        boolean empate = false;
        if (getGolesLocal()==getGolesVisitante()){
            empate = true;
            System.out.println("Gano el equipo local");
        }
        return empate;
    }

    // SET SCORE
    public void setScore() {
        golesVisitante = (int)(Math.random()*4+1);
        golesLocal = (int)(Math.random()*4+1);
        System.out.println("Resultado: " + golesLocal + " - " + golesVisitante);

    }


}
