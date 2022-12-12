package sistemaGarage.vehiculos;

public class Auto extends Vehiculo{

    private int numeroDePuertas;

    public Auto (double kilometraje, int numeroDeRuedas, String marca, int numeroDePuertas) {
        super (kilometraje, numeroDeRuedas, marca);
        setNumeroDePuertas(numeroDePuertas);
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Auto=" + " kilometraje:" + getKilometraje() +
                ", numeroDeRuedas:" + getNumeroDeRuedas() +
                ", marca:" + getMarca() + ", numero de puertas:" + getNumeroDePuertas();
    }
}
