package Play;

public class Player {
    private String name;

    public Player(String name) {

        this.name = name;
    }

    public Choices chooseHande() {
        return Choices.values()[(int) (Math.random() * 3)];
    }

    public String getName() {

        return name;
    }
}