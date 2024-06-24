package ficha_pratica_04;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2;
        String op, saida;
        String continuar;

        continuar = "x";
        System.out.println("\n-- CALCULADORA --");

        while (!continuar.equals("n")) {

            System.out.print("Digite o primeiro valor: ");
            n1 = input.nextInt();

            // Validar operação
            op = "x";
            while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                System.out.println("Escolha uma opção: ");
                System.out.println("[+] - SOMA");
                System.out.println("[-] - SUBTRAÇÃO");
                System.out.println("[*] - MULTIPLICAÇÃO");
                System.out.println("[/] - DIVISÃO");
                System.out.print(">> ");
                op = input.next();

                if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                    System.out.println(" --- Opção inválida. Tente novamente! ---\n");
                }
            }

            System.out.print("Digite o segundo valor: ");
            n2 = input.nextInt();

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
            // exibir resultado

            System.out.println(saida);
            continuar = "x";
            // Ler opção de encerramento
            while(!continuar.equals("s") && !continuar.equals("n")){
                System.out.println("Deseja continuar?");
                System.out.println("s - sim");
                System.out.println("n - não");
                System.out.print(">> ");
                continuar = input.next();

                if (!continuar.equals("s") && !continuar.equals("n")){
                    System.out.println("\nOpção inválida.");
                }
                System.out.println();
            }

        }

        System.out.println("\n ------ \n");

    }

}
