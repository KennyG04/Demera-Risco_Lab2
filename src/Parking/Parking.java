package Parking;

import Vehiculos.Vehiculos;

public class Parking {
    private EspacioDeParking[] espacios;

    public Parking(int capacidad) {
        espacios = new EspacioDeParking[capacidad];
        for (int i = 0; i < capacidad; i++) {
            espacios[i] = new EspacioDeParking(i + 1);
        }
    }

    public boolean aparcarVehiculo(Vehiculos vehiculo) {
        for (EspacioDeParking espacio : espacios) {
            if (espacio.estaLibre()) {
                espacio.ocuparEspacio(vehiculo);
                System.out.println(vehiculo.getTipo() + " con placa " + vehiculo.getPlaca() + " aparcado en espacio " + espacio.getNumero());
                return true;
            }
        }
        System.out.println("No hay espacios disponibles para el " + vehiculo.getTipo());
        return false;
    }

    public void liberarEspacio(int numero) {
        if (numero > 0 && numero <= espacios.length) {
            EspacioDeParking espacio = espacios[numero - 1];
            if (!espacio.estaLibre()) {
                System.out.println(espacio.getVehiculo().getTipo() + " con placa " + espacio.getVehiculo().getPlaca() + " ha salido del espacio " + numero);
                espacio.liberarEspacio();
            } else {
                System.out.println("El espacio " + numero + " ya esta libre.");
            }
        } else {
            System.out.println("Numero de espacio inválido.");
        }
    }

    public void mostrarEstado() {
        for (EspacioDeParking espacio : espacios) {
            if (espacio.estaLibre()) {
                System.out.println("Espacio " + espacio.getNumero() + " esta libre.");
            } else {
                System.out.println("Espacio " + espacio.getNumero() + " esta ocupado por " + espacio.getVehiculo().getTipo() + " con placa " + espacio.getVehiculo().getPlaca());
            }
        }
    }
}
