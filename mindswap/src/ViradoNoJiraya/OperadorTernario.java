package ViradoNoJiraya;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000D;
        String mensagemDoar = "Eu vou doar 500 pro DevJojo";
        String mensagemNaoDoar = "Nao tenho condicoes para doar";

       /* if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }   */
        // (condicao) ? verdadeiro : falso
        /*String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar; */

        System.out.printf(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
    }
}
