package ViradoNoJiraya;

public class Operadores {
    public static void main(String[] args) {
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLEiMAiorQueTrinta = idade > 30 && salario > 4612;
        System.out.println(isDentroDaLEiMAiorQueTrinta);
        //ambos precisam ser verdadeiros

        double valorTotalConta = 200;
        double valorTotalPoupanca = 1000;
        float valorPlay5 = 500F;

        boolean isPlaystation5compravel = valorTotalConta > valorPlay5 || valorTotalPoupanca > valorPlay5;
        System.out.println(isPlaystation5compravel);
        //1 opcao verdadeira = verdadeiro

        //= += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000; //2800
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
