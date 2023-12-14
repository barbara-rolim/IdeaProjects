package ViradoNoJiraya;

public class EstruturaC {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado){
            System.out.println("Autorizado a comprar");
            return;
        }
        System.out.println("Não pode comprar");
    }
}
