package Car;

import Exercise.Tire;

public class Car {
    private String brand;
    private String color;
    private Engine engine;
    private Tire tire;
    private Radio radio;

    public Car(String brand, String color, Engine engine, Tire tire, Radio radio){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.tire = tire;
        this.radio = radio;
    }
    public void changePneus(){
        tire.setIntegrity(100);
        tire.setExploded(false);
    }
    public void accelerate(int fuel){
        if(tire.isExploded()){
            System.out.println("Change Tires.");
            return;
        }
        int distance = engine.generateEnergy(fuel);
        tire.isTiresExploded(distance);
        boolean isTiresExploded = tire.isTiresExploded(distance);
        if(isTiresExploded){
            radio.play();
            return;
        }

        if (distance > 0) {
            System.out.println("Vrum, vrum for " + distance + "km.");
            return;
        }

        System.out.println("No vrum, vrum for you!");
    }

    public void getRefuelled(){
        engine.setFuelLevel(100);
    }

    public String getBrand(String brand){
        return this.brand;
    }

    public String getColor(String color){
        return this.color;
    }
}
