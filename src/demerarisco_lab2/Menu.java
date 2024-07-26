package demerarisco_lab2;

import Parking.Parking;
import java.util.Scanner;

public class Menu {
    private Parking parking;
    private Scanner sc;
    private OperacionesParking operaciones;

    public Menu() {
        sc = new Scanner(System.in);
        inicializarParking();
        operaciones = new OperacionesParking(parking, sc);
        ejecutarMenu();
    }

    private void inicializarParking() {
        System.out.println("BIENVENIDO AL SISTEMA DE PARKING");
        System.out.println("Ingrese la capacidad del parking (1-10): ");
        int capacidad = sc.nextInt();
        while (capacidad > 10 || capacidad <= 0) {
            System.out.println("Error, cantidad invalidada. Ingrese nuevamente '1-10'");
            capacidad = sc.nextInt();
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
                    operaciones.aparcarVehiculo();
                    break;
                case 2:
                    operaciones.liberarEspacio();
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

    public static void main(String[] args) {
        new Menu();
    }
}
