package sistemaGarage;

import mundial.Partido;
import sistemaGarage.vehiculos.Vehiculo;

import java.util.ArrayList;

public class Garage {
    private double precioPorRueda;
    private int maximaCapacidad;
    private ArrayList<Vehiculo> vehiculos;

    //CONSTRUCTOR
    public Garage() {
    }

    public Garage(double precioPorRueda, int maximaCapacidad) {
        setPrecioPorRueda(precioPorRueda);
        setMaximaCapacidad(maximaCapacidad);
        setVehiculos(new ArrayList<Vehiculo>(0));
    }

    public double getPrecioPorRueda() {
        return precioPorRueda;
    }

    public void setPrecioPorRueda(double precioPorRueda) {
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

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo (Vehiculo vehiculo) {
        if (getVehiculos().size()<getMaximaCapacidad()) {
        getVehiculos().add(vehiculo);
            System.out.println("Su vehiculo fue agregado con exito");
    } else {
            System.out.println("Maxima capacidad excedida, su vehiculo no pudo ser agregado");
        }
    }

    public void removerVehiculo (Vehiculo vehiculo) {
        getVehiculos().remove(vehiculo);
    }

    public double precioCambiarTodasLasRuedas (){

        double precio = 0;

        for (int i = 0; i < getVehiculos().size();) {
          precio = getVehiculos().get(i).getNumeroDeRuedas()*getPrecioPorRueda()+precio;
          i++;
    }
        return precio;
    }

    public double kilometrajeMedio () {

        double kilometraje = 0;

        for (int i = 0; i < getVehiculos().size();) {
            kilometraje = getVehiculos().get(i).getKilometraje()+kilometraje;
            i++;

    }
        return kilometraje / getVehiculos().size();
    }

    public void toStringVehiculos () {
        for (int i = 0; i < getVehiculos().size();) {
            System.out.println(getVehiculos().get(i).toString());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Garage=" +
                " precioPorRueda:" + getPrecioPorRueda() +
                ", maximaCapacidad:" + getMaximaCapacidad();
    }
}
