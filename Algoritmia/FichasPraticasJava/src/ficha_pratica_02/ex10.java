package ficha_pratica_02;

import java.util.Scanner;

public class ex10 {
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
