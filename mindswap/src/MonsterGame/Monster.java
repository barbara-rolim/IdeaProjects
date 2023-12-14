package MonsterGame;

public abstract class Monster {

    private MonsterType type;
    private int healthPoints;
    private String name;

    public Monster(MonsterType type, int healthPoints, String name) {
        this.type = type;
        this.healthPoints = healthPoints;
        this.name = name;
    }

    public abstract void attack(Monster target);

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return healthPoints > 0;
    }
}