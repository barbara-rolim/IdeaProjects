package Car;

import Exercise.Tire;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("BMW", "White", new Engine(), new Tire(), new Radio());
        car.accelerate(2);
        car.accelerate(10);
        car.accelerate(2);
        car.changePneus();
        car.accelerate(2);
    }

}

