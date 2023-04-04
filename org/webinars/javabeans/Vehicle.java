package org.webinars.javabeans;

import java.time.Instant;

public class Vehicle {
    protected final double price = 0.04;
    private final String model;

    private final String plate;
    private final Instant entryInstant;

    public Vehicle(String model, String plate) {
        this.model = model;
        this.plate = plate;
        this.entryInstant = Instant.now();
    }

    public String getPlate() {
        return plate;
    }

    public Instant getEntryInstant() {
        return entryInstant;
    }

    public double calculatePricePerMinute() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("(Vehicle) %s %s %s %s", model, plate, entryInstant, calculatePricePerMinute());
    }
}
