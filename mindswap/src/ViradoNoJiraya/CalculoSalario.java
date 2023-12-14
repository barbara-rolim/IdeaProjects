package ViradoNoJiraya;

public class CalculoSalario {

    public static void main(String[] args) {
        int salario = 2500;
        int porcentagem = 30;
        float porcentagem2 = 15;

        if (salario > 4500) {
            System.out.println("Maior que 4500 " + salario * (porcentagem / 100));
            return;
        }
        System.out.println(("Menor que 4500 " + salario * (porcentagem2 / 100)));
    }
}
