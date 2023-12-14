package BearShopExercise;

import java.util.Random;

public class TheDrunkBear extends Bear {
    public TheDrunkBear(int batteryLevel) {
        super(batteryLevel);
    }

    public void talk() {
        if (new Random().nextDouble() < 0.002) {
            System.out.println("Bear fell asleep, snoring instead");
        }
        if (getBatteryLevel() <= 0) {
            System.out.println("Batteries below 50%, singing a sad song");
            return;
        }
        super.talk();
    }
}