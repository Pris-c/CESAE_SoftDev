package ficha_pratica_01;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        // Desafio: efetuar sem variáveis adicionais

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("\n-- PERMUTA VALORES DAS VARIÁVEIS --");

        System.out.println("Informe o primeiro valor: ");
        System.out.print("valor1: ");
        valor1 = input.nextInt();

        System.out.println("Informe o segundo valor: ");
        System.out.print("valor2: ");
        valor2 = input.nextInt();

        // Permutar sem variável adicional
        valor1 += valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("\n ------ \n");
        System.out.println("valor1 = " + valor1);
        System.out.print("valor2 = " + valor2);

    }
}
