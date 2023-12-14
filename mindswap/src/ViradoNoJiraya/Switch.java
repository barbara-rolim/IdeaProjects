package ViradoNoJiraya;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tipo de conta");
        String conta = input.next();

        switch (conta) {
            case "Conta_Poupanca":
                System.out.println("0.05%");
                break;
            case "Conta_Corrente":
                System.out.println("0.02%");
                break;
            case "Conta_Investimento":
                System.out.println("0.01%");
                break;
            default:
                System.out.println("Conta inexistente");
        }
    }
}




