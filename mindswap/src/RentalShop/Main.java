package RentalShop;

public class Main {
    public static void main(String[] args) {
        // Example usage
        RentalShop rentalShop = new RentalShop("MyRentalShop");

        Car car = new Car("Sedan", 10.0, 50);
        Motorcycle motorcycle = new Motorcycle("Sport", 15.0, 30);

        rentalShop.showVehicleList();

        Client client = new Client(123456);

        client.rent(rentalShop, car);
        client.trip(100, 1, car);
        client.refuel(car, 20);
        client.returnVehicle(rentalShop, car, 22.5);
        client.pay(rentalShop);

        client.rent(rentalShop, motorcycle);
        client.trip(50, 1, motorcycle);
        client.refuel(motorcycle, 10);
        client.returnVehicle(rentalShop, motorcycle, 15);
        client.pay(rentalShop);
    }
}