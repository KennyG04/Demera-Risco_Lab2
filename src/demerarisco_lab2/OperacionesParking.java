/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demerarisco_lab2;

import Parking.Parking;
import Vehiculos.Carro;
import Vehiculos.Motocicleta;
import Vehiculos.Vehiculos;
import java.util.Scanner;

public class OperacionesParking {
    private Parking parking;
    private Scanner sc;

    public OperacionesParking(Parking parking, Scanner sc) {
        this.parking = parking;
        this.sc = sc;
    }
    //Ingreso de datos, para el parking
    public void aparcarVehiculo() {
        System.out.println("Ingrese el tipo de vehiculo (Carro/Motocicleta): ");
        String tipo = sc.nextLine();
        System.out.println("Ingrese la marca del vehiculo: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese la placa del vehiculo: ");
        String placa = sc.nextLine();
        
        Vehiculos vehiculo;
        if (tipo.equalsIgnoreCase("Carro")) {
            vehiculo = new Carro(marca, placa, 4);
        } else if (tipo.equalsIgnoreCase("Motocicleta")) {
            vehiculo = new Motocicleta(marca, placa, 2);
        } else {
            System.out.println("Tipo de vehiculo no valido.");
            return;
        }
        parking.aparcarVehiculo(vehiculo);
    }

    public void liberarEspacio() {
        System.out.println("Ingrese el numero del espacio a liberar: ");
        int numero = sc.nextInt();
        sc.nextLine();  
        parking.liberarEspacio(numero);
    }
}
