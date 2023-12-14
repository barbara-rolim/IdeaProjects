package RockPaperScissors;
import java.util.Scanner;

public class RockPaperScissors {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int pontuacaoJogador1 = 0;
            int pontuacaoJogador2 = 0;

            while (pontuacaoJogador1 < 3 && pontuacaoJogador2 < 3) {
                System.out.println("Rodada " + (pontuacaoJogador1 + pontuacaoJogador2 + 1));
                System.out.println("Jogador 1, escolha (0 - Pedra, 1 - Papel, 2 - Tesoura): ");
                int escolhaJogador1 = scanner.nextInt();

                System.out.println("Jogador 2, escolha (0 - Pedra, 1 - Papel, 2 - Tesoura): ");
                int escolhaJogador2 = scanner.nextInt();

                if (ganhou(escolhaJogador1, escolhaJogador2)) {
                    System.out.println("Jogador 1 ganha a rodada!\n");
                    pontuacaoJogador1++;
                } else if (ganhou(escolhaJogador2, escolhaJogador1)) {
                    System.out.println("Jogador 2 ganha a rodada!\n");
                    pontuacaoJogador2++;
                } else {
                    System.out.println("Empate! Essa rodada não conta.\n");
                }
            }

            if (pontuacaoJogador1 > pontuacaoJogador2) {
                System.out.println("Jogador 1 venceu o jogo!");
            } else {
                System.out.println("Jogador 2 venceu o jogo.");
            }
        }

        public static boolean ganhou(int escolhaJogador1, int escolhaJogador2) {
            return (escolhaJogador1 == 0 && escolhaJogador2 == 2) ||
                    (escolhaJogador1 == 1 && escolhaJogador2 == 0) ||
                    (escolhaJogador1 == 2 && escolhaJogador2 == 1);
        }
    }
