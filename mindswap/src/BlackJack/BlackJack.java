package BlackJack;

import java.util.Random;

public class BlackJack { //Classe
    private static final int MAX_SCORE = 21; //Aqui, estamos definindo uma constante chamada MAX_SCORE que representa a pontuação máxima permitida
    private int clientScore; //variavel clientScore
    private int dealerScore; //variavel dealerScore, mantem a pontuacao de cada um

    public void play() { //metodo principal
        System.out.println("#".repeat(5) + "GAME STARTS" + "#".repeat(5));
//#####GAME STARTS##### resultado de "#".repeat(5)
        while (gameIsNotOver()) { // enquanto o jogo nao acaba
            clientScore += pickCard("John"); //método pickCard em Java está responsável por simular a escolha de uma carta
            dealerScore += pickCard("Mary"); //dealerScore += pickCard("Mary"); adiciona o valor retornado por pickCard ao valor atual de clientScore.
            System.out.println("#".repeat(5) + "NEXT ROUND" + "#".repeat(5));
        }

        printWinner(); //mostrar vencedor
    }

    private int pickCard(String playerName) {
        Random random = new Random(); //objeto Random, podemos usá-lo para gerar números aleatórios.
        int card = random.nextInt(11) + 1; // nextInt escolhe um número aleatório de 1 a 11
        System.out.println(playerName + " picked " + card);
        return card;
    }

    private boolean gameIsNotOver() { //Este método retorna true se ambos os jogadores têm uma pontuação menor que 21, o que significa que o jogo ainda não acabou.
        return clientScore < MAX_SCORE && dealerScore < MAX_SCORE;
    }

    private void printWinner() { //Este método determina o vencedor com base nas pontuações e imprime o resultado.
        if (clientScore == dealerScore || clientScore > MAX_SCORE && dealerScore > MAX_SCORE) {
            System.out.println("It's a tie!"); //empate
        } else if (clientScore > MAX_SCORE || (dealerScore > clientScore && dealerScore <= MAX_SCORE)) {
            System.out.println("Mary wins!");
        } else {
            System.out.println("John wins!");
        }
    }

    public static void main(String[] args) { //No método main, criamos uma instância de BlackJackGame e chamamos o método play para iniciar o jogo.
        BlackJack game = new BlackJack();
        game.play();
    }
}
