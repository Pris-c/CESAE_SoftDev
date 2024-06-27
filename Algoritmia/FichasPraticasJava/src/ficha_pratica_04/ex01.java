package ficha_pratica_04;

import java.util.Scanner;

public class ex01 {
    /*
        Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
        operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores.
        No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        Exemplo: Deseja continuar? (introduza s/n).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double n1, n2;
        String op, saida, continuar;

        continuar = "x";
        System.out.println("\n-- CALCULADORA --");
        do{
            System.out.print("Digite o primeiro valor: ");
            n1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            n2 = input.nextDouble();

            // Validar operação
            do {
                System.out.print("Escolha a operação ( +, -, *, / ): ");
                op = input.next();

                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                    System.out.println(" --- Opção inválida. Tente novamente! ---\n");
                }

            } while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/"));

            saida = "";
            switch (op){
                case "+":
                    saida = n1 + " + " + n2 + " = " + (n1 + n2) + "\n";
                    break;
                case "-":
                    saida = n1 + " - " + n2 + " = " + (n1 - n2) + "\n";
                    break;
                case "*":
                    saida = n1 + " * " + n2 + " = " + (n1 * n2) + "\n";
                    break;
                case "/":
                    if (n2 == 0){
                        System.out.println("\nDivisão impossível! Tente novamente.");
                    } else {
                        saida = n1 + " / " + n2 + " = " + (n1 / n2) + "\n";
                    }
                    break;
            }
            System.out.println("\n ------ \n");
            System.out.println(saida);


            do {
                System.out.println("Deseja continuar?");
                System.out.println("s - sim");
                System.out.println("n - não");
                System.out.print(">> ");
                continuar = input.next();

                if (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n")) {
                    System.out.println("\nOpção inválida.");
                }
            } while  (!continuar.equalsIgnoreCase("s") && !continuar.equalsIgnoreCase("n"));

            System.out.println();

        } while(!continuar.equalsIgnoreCase("n"));

        System.out.println("\n ------ \n");

    }

}
