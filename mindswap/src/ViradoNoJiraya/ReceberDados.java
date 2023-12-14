package ViradoNoJiraya;

import java.util.Scanner;

public class ReceberDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
    }
}
