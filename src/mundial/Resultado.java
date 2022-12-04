package mundial;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public Resultado() {
        this.golesLocal = (int)(Math.random()*4);
        this.golesVisitante = (int)(Math.random()*4);
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

        } else {
            ganoLocal = false;
        }
        return ganoLocal;
    }

    public boolean empate () {
        boolean empate = false;
        if (getGolesLocal()==getGolesVisitante()){
            empate = true;
        } else {
            empate = false;
        }
        return empate;
    }

    @Override
    public String toString() {
        return "Resultado:" +
                "golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                '}';
    }
}
