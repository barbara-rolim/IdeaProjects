package ViradoNoJiraya;

public class Switch02 {
    public static void main(String[] args) {

        int dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.printf("Opcao invalida");
                break;
        }
    }
}
