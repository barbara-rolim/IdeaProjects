package BearShopExercise;

public class Bear {
    private int batteryLevel;

    public Bear(int batteryLevel) {
        this.batteryLevel = 100;
    }

    public void talk() {
        System.out.println("I love you");
        decreaseBatteryLevel();
    }

    private void decreaseBatteryLevel() {
        batteryLevel -= 10;
        if (batteryLevel <= 0) {
            System.out.println("Batteries exhausted");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}