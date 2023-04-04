package org.webinars.javabeans;

import java.util.Scanner;

public class Bus extends Vehicle {

    private int seats;

    public Bus(String model, String plate, int seats) {
        super(model, plate);
        this.seats = seats;
    }

    @Override
    public double calculatePricePerMinute() {
        return price + (0.25d * seats);
    }
}
