package ViradoNoJiraya;

public class ECondicional {
    public static void main(String[] args) {
        double salarioAnual = 7000;
        double primeiraFaixa = 9.70 / 100;
        double segFaixa = 37.35 / 100;
        double terFaixa = 49.50 / 100;

        if (salarioAnual <= 34.713) {
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34.713) {
            salarioAnual = salarioAnual * segFaixa;
        } else {
            salarioAnual = salarioAnual * terFaixa;
        }
        System.out.println(salarioAnual);
    }
}
