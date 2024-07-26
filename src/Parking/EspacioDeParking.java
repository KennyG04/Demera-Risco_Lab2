package Parking;

import Vehiculos.Vehiculos;

public class EspacioDeParking {
    private int numero;
    private Vehiculos vehiculo;

    public EspacioDeParking(int numero) {
        this.numero = numero;
        this.vehiculo = null; // Espacio libre
    }

    public int getNumero() {
        return numero;
    }

    public Vehiculos getVehiculo() {
        return vehiculo;
    }

    public void ocuparEspacio(Vehiculos vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void liberarEspacio() {
        this.vehiculo = null;
    }

    public boolean estaLibre() {
        return vehiculo == null;
    }
}
