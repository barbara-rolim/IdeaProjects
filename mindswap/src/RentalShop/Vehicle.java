package RentalShop;

import java.util.Objects;

public class Vehicle {
    private boolean isRented;
    private String modelName;
    private double fuelConsumption;
    private int maxSpeed;
    private int tankCapacity;

    public Vehicle(String modelName, double fuelConsumption, int maxSpeed, int tankCapacity) {
        this.modelName = modelName;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.tankCapacity = tankCapacity;
        this.isRented = false;
    }

    public boolean isRented() {
        return isRented;
    }

    public String getModelName() {
        return modelName;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void updateTankCapacity(int amount) {
        tankCapacity += amount;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public void returnVehicle(Client client, double fuelLevel) {
        if (!isInProperCondition()) {
            double missingFuel = 20.0 - tankCapacity;
            double chargeAmount = missingFuel * 2.5;
            System.out.println("Missing fuel charged: " + chargeAmount + " euros.");
        }

        System.out.println("Vehicle returned successfully.");
        resetVehicle();
    }

    private boolean isInProperCondition() {
        return true;
    }

    private void resetVehicle() {
        tankCapacity = 25;
        isRented = false;
    }

    @Override
    public String toString() {
        return "Model: " + getModelName() + ", Type: " + getType();
    }

    public String getType() {
        return "Generic Vehicle";
    }

    public boolean canTravel(int distance, int travelTime) {
        return false;
    }

    public double getRentalCost() {
        return 0;
    }
}