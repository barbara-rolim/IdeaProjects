package MonsterGame;

public class Mummy extends Monster {


    private int numOfAppearances;

    public Mummy() {
        super(MonsterType.MUMMY, 12, "Mummy");
    }


    @Override
    public void attack(Monster target) {
        target.setHealthPoints(target.getHealthPoints() - 4);
    }


    public int getNumOfAppearances() {
        return numOfAppearances;
    }

    public void setNumOfAppearances(int numOfAppearances) {
        this.numOfAppearances = numOfAppearances;
    }

}
