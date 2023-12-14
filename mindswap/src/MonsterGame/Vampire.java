package MonsterGame;

public class Vampire extends Monster {

    public Vampire() {
        super(MonsterType.VAMPIRE, 10, "Vampire");
    }

    @Override
    public void attack(Monster target) {
        target.setHealthPoints(target.getHealthPoints() - 6);
        int rand = (int) (Math.random() * 6);
        if (rand == 1) {
            setHealthPoints(getHealthPoints() + 2);
        }
    }
}
