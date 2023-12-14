package RentalShop;

public class Car extends Vehicle {
    private static final int MAX_SPEED = 120;

    public Car(String modelName, double fuelConsumption, int tankCapacity) {
        super(modelName, fuelConsumption, MAX_SPEED, tankCapacity);
    }

    @Override
    public boolean canTravel(int distance, int travelTime) {
        return travelTime <= getMaxSpeed() && getTankCapacity() >= distance * getFuelConsumption();
    }

    @Override
    public double getRentalCost() {
        return 30.0;
    }

    @Override
    public String getType() {
        return "Car";
    }
}
