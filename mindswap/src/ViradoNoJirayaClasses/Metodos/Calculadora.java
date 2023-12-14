package ViradoNoJirayaClasses.Metodos;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiaDoisNumeros(){
        System.out.println(20-10);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num*num2);
    }

    public void divideDoisnumeros(double num, double num2) {
        if(num2 == 0){
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(num/num2);
    }

    public void alteraDoisNumeros(int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArrey(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
