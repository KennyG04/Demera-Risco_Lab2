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


public class Menu {
    private Parking parking;
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
        inicializarParking();
        ejecutarMenu();
    }

    private void inicializarParking() {
        System.out.println("BIENVENIDO AL SISTEMA DE PARKING");
        System.out.println("Ingrese la capacidad del parking (1-10): ");
        int capacidad = sc.nextInt();
        while (capacidad>10 || capacidad<=0){
            System.out.println("Error, cantidad invalidada. Ingrese nuevamente '1-10'");
            capacidad=sc.nextInt();
        }
        sc.nextLine();  
        parking = new Parking(capacidad);
    }

    private void ejecutarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("/*/*/*/*/*/*/*/*/*/");
            System.out.println("Menu de Parking:");
            System.out.println("1. Aparcar vehiculo");
            System.out.println("2. Liberar espacio");
            System.out.println("3. Mostrar estado");
            System.out.println("4. Salir");
            System.out.println("/*/*/*/*/*/*/*/*/*/");
            System.out.println("Seleccione una opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    aparcarVehiculo();
                    break;
                case 2:
                    liberarEspacio();
                    break;
                case 3:
                    parking.mostrarEstado();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    salir = true;  
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, ingrese nuevamente.");
            }
        }
    }

    private void aparcarVehiculo() {
        System.out.println("Ingrese el tipo de vehhculo (Carro/Motocicleta): ");
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
    private void liberarEspacio() {
        System.out.println("Ingrese el numero del espacio a liberar: ");
        int numero = sc.nextInt();
        sc.nextLine();  
        parking.liberarEspacio(numero);
    }
}

