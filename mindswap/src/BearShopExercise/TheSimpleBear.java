package BearShopExercise;

public class TheSimpleBear extends Bear {
    public TheSimpleBear(int batteryLevel) {
        super(batteryLevel);
    }

    public void talk() {
        while (getBatteryLevel() > 0) {
            super.talk();
        }
        System.out.println("Batteries exhausted");
    }
}