package org.webinars.utils;

import org.webinars.javabeans.Bus;
import org.webinars.javabeans.Van;
import org.webinars.javabeans.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class JParkingUtils {

    public static Vehicle buildVehicle(Scanner sc) {
        ArrayList<Object> data = promptVehicleData(sc);
        return new Vehicle((String) data.get(0), (String) data.get(1));
    }

    public static Van buildVan(Scanner sc) {
        ArrayList<Object> data = promptVanData(sc);
        return new Van((String) data.get(0), (String) data.get(1), (Double) data.get(2));
    }

    public static Bus buildBus(Scanner sc) {
        ArrayList<Object> data = promptBusData(sc);
        return new Bus((String) data.get(0), (String) data.get(1), (Integer) data.get(2));
    }

    private static ArrayList<Object> promptVehicleData(Scanner sc) {
        ArrayList<Object> data = new ArrayList<>();
        System.out.print("Introduce el modelo del vehiculo: ");
        data.add(sc.nextLine());
        System.out.print("Introduce el numero de matricula del nuevo vehiculo: ");
        data.add(sc.nextLine());
        return data;
    }

    private static ArrayList<Object> promptVanData(Scanner sc) {
        ArrayList<Object> data = promptVehicleData(sc);
        boolean valid = false;
        try {
            while (!valid) {
                System.out.print("Introduce la longitud de la furgoneta: ");
                data.add(Double.parseDouble(sc.nextLine()));
                valid = true;
            }
        } catch (NumberFormatException e) {
            System.err.println("Introduce una longitud valida");
        }
        return data;
    }

    private static ArrayList<Object> promptBusData(Scanner sc) {
        ArrayList<Object> data = promptVehicleData(sc);
        boolean valid = false;
        try {
            while (!valid) {
                System.out.print("Introduce el numero de asientos del autobus: ");
                data.add(Integer.parseInt(sc.nextLine()));
                valid = true;
            }
        } catch (NumberFormatException e) {
            System.err.println("Introduce una longitud valida");
        }
        return data;
    }
}
