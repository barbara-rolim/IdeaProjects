package BearShopExercise;


public class TheCrankyBear extends Bear {
    private boolean sadSong;

    public TheCrankyBear(int batteryLevel) {
        super(batteryLevel);
    }

    public void talk() {
        if (getBatteryLevel() > 50) {
            super.talk();
            return;
        }
        if (getBatteryLevel() < 50 && !sadSong) {
            System.out.println("Batteries below 50%, singing a sad song");
            sadSong = true;
            return;
        }
        System.out.println("Batteries exhausted");
    }
}
