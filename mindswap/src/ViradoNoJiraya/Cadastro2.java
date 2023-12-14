package ViradoNoJiraya;

import java.util.Scanner;

public class Cadastro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sexo(M/F)");
        String sexo = input.next();
        System.out.println("Idade");
        int idade = input.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Deseja se alistar?");
        } else {
            System.out.println("Alistamento não permitido");
        }
    }
}
