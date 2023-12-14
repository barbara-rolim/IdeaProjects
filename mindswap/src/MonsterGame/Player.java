package MonsterGame;

public class Player {

    private String name;
    private Monster[] hand;

    public Player(String name) {
        this.name = name;
    }

    public void pickCards(Game game) {
        for (int i = 0; i < hand.length; i++) {
            int rand = (int) (Math.random() * game.getAvailableHands().length);
            hand[i] = game.getAvailableHands()[rand];
        }
    }

    public Monster playCard() {
        int rand = (int) (Math.random() * hand.length);
        System.out.println(getName() + " plays " + hand[rand].getName());
        return hand[rand];
    }

    public String getName() {
        return name;
    }

    public void printPlayerStatus() {
        System.out.println(getName() + "'s Status:");
        for (Monster monster : hand) {
            System.out.println(monster.getName() + " - HP: " + monster.getHealthPoints());
        }
        System.out.println();
    }

    public void setCards(Monster[] hand) {
        this.hand = hand;
    }

    public Monster[] getHand() {
        return hand;
    }

    public boolean hasLost() {
        for (Monster monster : hand) {
            if (monster.isAlive()) {
                return false;
            }
        }
        return true;
    }
}