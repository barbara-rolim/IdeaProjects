package ViradoNoJiraya;

public class ControleDeFluxo {
    public static void main(String[] args) {
        double salario = 4663;

        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7.5% = " + (salario * 0.75));
        } else if (salario >= 3750.00 && salario <= 4664.68) {
            System.out.println("22.5% = " + (salario * 0.025));
        } else {
            System.out.println("27.5% = " + (salario * 0.275));
        }
    }
}
