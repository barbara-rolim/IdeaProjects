package ViradoNoJiraya;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        System.out.println("Digite um numero");
        Scanner input = new Scanner(System.in);
        int weekDay = input.nextInt();

        switch (weekDay){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            default:
                System.out.println("opcao invalida");
        }
    }
}