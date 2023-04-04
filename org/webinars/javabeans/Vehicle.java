package org.webinars.javabeans;

import java.time.LocalDateTime;

public class Vehicle {
    protected final double price = 0.04;
    private final String model;
    private final String plate;
    private final LocalDateTime entryDate;

    public Vehicle(String model, String plate) {
        this.model = model;
        this.plate = plate;
        this.entryDate = LocalDateTime.now();
    }

    public double calculatePricePerMinute() {
        return price;
    }
}
