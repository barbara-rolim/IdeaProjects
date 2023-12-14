package ViradoNoJiraya;

public class EstruturaRepeticao1 {
    public static void main(String[] args) {
        int valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            int valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                return;
            }
            System.out.println("Parcela " + parcela + "€ " + valorParcela);
        }
    }
}
