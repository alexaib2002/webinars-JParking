package org.webinars;

import org.webinars.javabeans.Vehicle;
import org.webinars.utils.JParkingUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class JParkingMain {
    public static final String MAIN_MENU = "===== JParking ===== \n" +
            "0. Salir del programa\n" +
            "1. Registrar la entrada de un vehiculo\n" +
            "2. Registrar la salida de un vehiculo\n" +
            "3. Numero de plazas disponibles\n" +
            "4. Imprimir estado del parking\n" +
            "5. Saldo acumulado del dia\n" +
            "6. Imprimir la lista de vehiculos que hay en el parking\n" +
            "Introduzca la opcion seleccionada: ";

    private static final ArrayList<Vehicle> parkedVehicles = new ArrayList<>();

    public static void main(String[] args) {
        boolean execute = true;
        Scanner sc = new Scanner(System.in);
        while (execute) {
            System.out.print(MAIN_MENU);
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 0 -> execute = false;
                    case 1 -> addVehicle(sc);
                    case 2 -> delVehicle(sc);
                    case 3 -> countAvail();
                    case 4 -> parkingStatus();
                    case 5 -> getDayEarnings();
                    case 6 -> getVehicleList();
                    default -> System.err.println("Introduce una opcion valida");
                }
            } catch (NumberFormatException e) {
                System.err.println("La opcion debe ser un numero entre 0 y 6");
            }
        }
        sc.close();
    }

    /**
     * Generates a new vehicle and appends it to the parking ArrayList
     * @param sc Scanner to be used at user prompt
     */
    private static void addVehicle(Scanner sc) {
        int type = -1;
        Vehicle vehicle;
        while (type <= 0) {
            System.out.print("1. Coche o moto\n" +
                    "2. Furgoneta\n" +
                    "3. Autobus\n" +
                    "Introduzca el tipo de vehiculo: ");
            try {
                type = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("La opcion debe ser un numero entre 1 y 3");
            }
        }
        switch (type) {
            case 1 -> vehicle = JParkingUtils.buildVehicle(sc);
            case 2 -> vehicle = JParkingUtils.buildVan(sc);
            case 3 -> vehicle = JParkingUtils.buildBus(sc);
            default -> throw new RuntimeException("Couldn't process option at vehicle creation");
        }
        parkedVehicles.add(vehicle);
    }

    /**
     * Given a vehicle plate, removes the vehicle associated to it from the parking list.
     * @param sc Scanner to be used at user prompt
     */
    private static void delVehicle(Scanner sc) {

    }

    /**
     * Prints number of parking spots available int the lot, or a message if the lot is full.
     */
    private static void countAvail() {

    }

    /**
     * Draws a map of the parking, marking occupied and free spots.
     */
    private static void parkingStatus() {

    }

    /**
     * Prints the earnings of the day, taking into account the entrance date of every existing vehicle in the lot and
     * their cost per minute.
     */
    private static void getDayEarnings() {

    }

    /**
     * Prints all vehicle data into stdout.
     */
    private static void getVehicleList() {

    }
}
