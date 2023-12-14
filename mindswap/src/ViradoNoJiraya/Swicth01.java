package ViradoNoJiraya;

public class Swicth01 {
    public static void main(String[] args) {
        String sexo = "F";

        switch (sexo) {
            case "M":
                System.out.println("Homem");
                break;
            case "F": {
                System.out.println("Mulher");
                break;
            }
            default:
                System.out.println("Inválido");
                break;
        }
    }
}