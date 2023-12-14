package Exercise;

public class Tire {

    private int integrity;

    private boolean exploded;

    public Tire() {
        integrity = 100;
        exploded = false;
    }

    public boolean isTiresExploded(int distance) {
        integrity = integrity - distance * 2;
        if (integrity <= 0) {
            exploded = true;
            return exploded;
        }
        return exploded;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public boolean isExploded() {
        return exploded;
    }

    public void setExploded(boolean exploded) {
        this.exploded = exploded;
    }
}

