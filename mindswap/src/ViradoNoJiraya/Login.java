package ViradoNoJiraya;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String login = "Passarinho";
        final int password = 123;
        boolean exibirLogin = true;
        Scanner scanner = new Scanner(System.in);

        while (exibirLogin) {
            System.out.println("Digite seu ViradoNoJiraya.Login");
            String logindigitado = scanner.next();
            System.out.println("Digite sua senha");
            int passworddigitada = scanner.nextInt();
            if(login.equals(logindigitado) && password == passworddigitada){
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado");
            }
        }
    }
