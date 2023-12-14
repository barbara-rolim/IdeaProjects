package ViradoNoJiraya;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ViradoNoJiraya.Login");
        String name = input.next();
        if (name.equals("") || name.equalsIgnoreCase("admin") || name.equalsIgnoreCase("administrador")){
            System.out.println("Usuario Invalido");
        } else {
            System.out.println(name + "Cadastrado com sucesso");
        }
    }
}
