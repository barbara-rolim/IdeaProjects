package MonsterGame;

public class Werewolf extends Monster {
    public Werewolf() {
        super(MonsterType.WEREWOLF, 15, "Werewolf");
    }

    @Override
    public void attack(Monster target) {
        target.setHealthPoints(getHealthPoints() - 3);
    }
}