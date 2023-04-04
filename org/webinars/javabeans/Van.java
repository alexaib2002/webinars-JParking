package org.webinars.javabeans;

public class Van extends Vehicle {

    private double len;

    public Van(String model, String plate, double len) {
        super(model, plate);
        this.len = len;
    }

    @Override
    public double calculatePricePerMinute() {
        return price + (0.2d * len);
    }
}
