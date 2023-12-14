package RentalShop;

public class Motorcycle extends Vehicle {
    private static final int MAX_SPEED = 100;
    private static final int MAX_TRIP_DISTANCE = 80;

    public Motorcycle(String modelName, double fuelConsumption, int tankCapacity) {
        super(modelName, fuelConsumption, MAX_SPEED, tankCapacity);
    }

    @Override
    public boolean canTravel(int distance, int travelTime) {
        return travelTime <= getMaxSpeed() && distance <= MAX_TRIP_DISTANCE && getTankCapacity() >= distance * getFuelConsumption();
    }

    @Override
    public double getRentalCost() {
        return 30.0; // Replace with actual cost calculation logic
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}