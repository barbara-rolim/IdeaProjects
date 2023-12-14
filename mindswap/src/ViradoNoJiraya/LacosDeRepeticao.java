package ViradoNoJiraya;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int numero = input.nextInt();
        int i = 0;
        while (i <= numero) {
            if (i % 2 != 0)
                System.out.println("numero = " + i);
            i++;
        }
    }
}
