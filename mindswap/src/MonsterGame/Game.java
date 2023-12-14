package MonsterGame;

public class Game {
    private Player player1;
    private Player player2;
    private Monster[] availableHands;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.availableHands = new Monster[]{new Vampire(), new Mummy(), new Werewolf(), new Vampire(), new Mummy(), new Werewolf(), new Vampire(), new Mummy(), new Werewolf(), new Vampire()};
    }

    private void numOfCardsForPlayer(Player player) {
        int totalCards = 5;
        Monster[] playerCard = new Monster[totalCards];

        for (int i = 0; i < totalCards; i++) {
            int rand = (int) (Math.random() * availableHands.length);
            playerCard[i] = availableHands[rand];
        }

        player.setCards(playerCard);
    }

    public void distributeCards(Game game) {
        numOfCardsForPlayer(player1);
        numOfCardsForPlayer(player2);
        player1.pickCards(game);
        player2.pickCards(game);
    }

    public void round() {
        if (!GameOver()) {
            Monster chosenMonsterP1 = player1.playCard();
            Monster chosenMonsterP2 = player2.playCard();

            chosenMonsterP1.attack(chosenMonsterP2);

            if (!GameOver()) {
                Monster chosenMonsterP2Counter = player2.playCard();
                Monster chosenMonsterP1Counter = player1.playCard();

                chosenMonsterP2Counter.attack(chosenMonsterP1Counter);
            }
        }
    }

    public boolean GameOver() {
        return player1.hasLost() || player2.hasLost();
    }

    public Monster[] getAvailableHands() {
        return availableHands;
    }
}
