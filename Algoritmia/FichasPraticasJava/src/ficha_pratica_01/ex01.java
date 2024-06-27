package ficha_pratica_01;

import java.util.Scanner;

public class ex01 {
    /*
        Escreva um programa que faça a soma de dois números introduzidos pelo utilizador. Apresente o
        resultado da operação.
     */

    public static void main(String[] args) {

        // Soma dois números introduzidos pelo utilizador

        Scanner input = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("\n-- SOMA DOIS NUMEROS INTEIROS --");
        System.out.print("Informe o primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("\n ------ \n");
        System.out.println("Soma = " + soma);

    }

}
