package ficha_pratica_01;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        // Lê dois valores e exibe o resultado das 4 operações básicas

        Scanner input = new Scanner(System.in);

        double num1, num2, result;

        System.out.println("\n-- REALIZA AS 4 OPERAÇÕES BÁSICAS --");

        System.out.print("Informe o primeiro valor: ");
        num1 = input.nextDouble();
        System.out.print("Informe o segundo valor: ");
        num2 = input.nextDouble();
        System.out.println("\n ------ \n");

        result = num1 + num2;
        System.out.println("Soma: " + result);

        result = num1 - num2;
        System.out.println("Subtração: " + result);

        result = num1 * num2;
        System.out.println("Multipicação: " + result);

        result = num1 / num2;
        System.out.println("Divisão: " + result);

    }
}
