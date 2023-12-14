package RentalShop;

import java.util.List;

class Client {
    private int driversLicense;

    public Client(int driversLicense) {
        this.driversLicense = driversLicense;
    }

    public void chooseVehicle(RentalShop rentalShop) {
        rentalShop.showVehicleList();
    }

    public void rent(RentalShop rentalShop, Vehicle vehicle) {
        rentalShop.rentVehicle(vehicle, this);
    }

    public void trip(int distance, int fuelCapacity, Vehicle vehicle) {
        if (vehicle.canTravel(distance, 1)) {
            System.out.println("Client took a trip with the " + vehicle.getType());
        }
    }

    public void refuel(Vehicle vehicle, int amount) {
        vehicle.updateTankCapacity(amount);
        System.out.println("Vehicle refueled. New tank capacity: " + vehicle.getTankCapacity() + "L");
    }

    public void returnVehicle(RentalShop rentalShop, Vehicle vehicle, double fuelLevel) {
        rentalShop.returnVehicle(this, vehicle, fuelLevel);
    }

    public void pay(RentalShop rentalShop) {
        rentalShop.sumBill(50, 0);
        System.out.println("Client paid the bill.");
    }
}




