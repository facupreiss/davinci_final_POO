package sistemaGarage;

import sistemaGarage.vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garage {
    private int precioPorRueda;
    private int maximaCapacidad;
    private ArrayList<Vehiculo> vehiculos;

    public int getPrecioPorRueda() {
        return precioPorRueda;
    }

    public void setPrecioPorRueda(int precioPorRueda) {
        this.precioPorRueda = precioPorRueda;
    }

    public int getMaximaCapacidad() {
        return maximaCapacidad;
    }

    public void setMaximaCapacidad(int maximaCapacidad) {
        this.maximaCapacidad = maximaCapacidad;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void agregarVehiculo (Vehiculo vehiculo) {
        getVehiculos().add(vehiculo);
    }

    public void removerVehiculo (Vehiculo vehiculo) {
        getVehiculos().remove(vehiculo);
    }

    public double precioCambiarTodasLasRuedas (){
        return 4.0;
    }

    public double kilometrajeMedio (double kilometrajeMedio) {
        return 4.0;
    }
}
