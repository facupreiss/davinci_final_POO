package sistemaGarage.vehiculos;

public class Moto extends Vehiculo{
    public int cilindrado;

public Moto (double kilometraje, int numeroDeRuedas, String marca, int cilindrado) {
    super (kilometraje, numeroDeRuedas, marca);
    setCilindrado(cilindrado);
    }

    public int getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }

}
