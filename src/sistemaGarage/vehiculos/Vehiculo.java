package sistemaGarage.vehiculos;

public class Vehiculo {
    private double kilometraje;
    private int numeroDeRuedas;
    private String marca;

    public Vehiculo(double kilometraje, int numeroDeRuedas, String marca) {
        setKilometraje(kilometraje);
        setNumeroDeRuedas(numeroDeRuedas);
        setMarca(marca);
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
