package ViradoNoJiraya;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner input = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Dinheiro");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção");
            opcao = input.nextInt();
        }
        System.out.println("Programa Encerrado");
    }
}
