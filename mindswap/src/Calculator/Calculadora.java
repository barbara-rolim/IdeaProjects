package Calculator;

import java.util.Scanner;
public class Calculadora {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem-vindo à Calculadora Simples!");
            System.out.println("Por favor, insira o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Por favor, insira o segundo número:");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha a operação (+, -, *, /):");
            char operador = scanner.next().charAt(0); //lê o primeiro caractere da entrada do usuário e o armazena na variável operador.

            double resultado = 0;

            switch (operador) { /*switch: É a palavra-chave que indica o início de uma estrutura de controle switch.
(operador): Aqui, operador é a expressão que será avaliada.*/
                case '+': // representa uma opção que o programa pode escolher.
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    return;
            }

            System.out.println("O resultado é: " + resultado);
        }
    }
