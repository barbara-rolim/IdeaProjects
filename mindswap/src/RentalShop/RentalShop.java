package RentalShop;

import java.util.ArrayList;
import java.util.List;

class RentalShop {
    private String name;
    private List<Vehicle> vehicles;
    private List<Client> clients;
    private double checkCondition;
    private double sumBill;

    public RentalShop(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.checkCondition = 0.0;
        this.sumBill = 0.0;
    }

    public void showVehicleList() {
        if (vehicles != null) {
            System.out.println("Available Vehicles:");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        } else {
            System.out.println("Vehicle list is null.");
        }
    }

    public void rentVehicle(Vehicle vehicle, Client client) {
        if (vehicles.contains(vehicle) && !vehicle.isRented()) {
            client.rent(this, vehicle);
            System.out.println("Vehicle rented successfully.");
            vehicles.remove(vehicle);
        } else {
            System.out.println("Vehicle not available for rent.");
        }
    }

    private void checkCondition(int tankCapacity) {
        checkCondition = (tankCapacity < 20.0) ? (20.0 - tankCapacity) * 2.5 : 0.0;
    }

    public void returnVehicle(Client client, Vehicle vehicle, double fuelLevel) {
        vehicle.setRented(false);
        vehicle.returnVehicle(client, fuelLevel);
        checkCondition(vehicle.getTankCapacity());
        sumBill(vehicle.getRentalCost(), checkCondition);
        vehicles.add(vehicle);
    }

    public void setCheckCondition(double fuelLevel) {
        checkCondition = (fuelLevel < 20.0) ? (20.0 - fuelLevel) * 2.5 : 0.0;
    }

    public void sumBill(double rentalCost, double checkCondition) {
        sumBill = rentalCost + checkCondition;
    }
}
