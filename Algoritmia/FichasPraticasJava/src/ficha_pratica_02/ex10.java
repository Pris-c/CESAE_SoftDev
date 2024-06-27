package ficha_pratica_02;

import java.util.Scanner;

public class ex10 {
    /*
        Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String operacao;

        System.out.println("\n-- CALCULADORA --");
        System.out.print("Informe o primeiro valor: ");
        num1 = input.nextDouble();

        System.out.print("Informe o segundo valor: ");
        num2 = input.nextDouble();

        System.out.print("Informe a operação desejada ( +, -, *, / ): ");
        operacao = input.next();

        System.out.println("\n ------ \n");

        switch (operacao) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}
