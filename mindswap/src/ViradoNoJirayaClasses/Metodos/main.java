package ViradoNoJirayaClasses.Metodos;

public class main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("-----");
        calculadora.subtraiaDoisNumeros();
        System.out.println("-----");
        calculadora.multiplicaDoisNumeros(2,4);
        System.out.println("-----");
        calculadora.divideDoisnumeros(20,0);

        System.out.println("--------------");
        Calculadora calculadora2 = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora2.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da calculadora");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

        System.out.println("--------------");
        Calculadora calculadora3 = new Calculadora();
        calculadora.somaArrey(new int[] {1,2,3,4,5});
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
