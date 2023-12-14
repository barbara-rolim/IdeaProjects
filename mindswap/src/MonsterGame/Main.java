package MonsterGame;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Game game = new Game(player1, player2);

        game.distributeCards(game);
        player1.pickCards(game);
        player2.pickCards(game);

        while (!game.GameOver()) {
            game.round();
            player1.printPlayerStatus();
            player2.printPlayerStatus();
        }

        if (player1.hasLost()) {
            System.out.println("Player 2 venceu!");
            return;
        }
        System.out.println("Player 1 venceu!");
    }
}
