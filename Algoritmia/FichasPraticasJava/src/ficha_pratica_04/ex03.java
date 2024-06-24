package ficha_pratica_04;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nSecreto, n, cont;

        System.out.println("\n-- NUMERO SECRETO  --");

        nSecreto = -1;
        while (nSecreto < 0 || nSecreto > 100){
            System.out.println("JOGADOR 1: Defina um número secreto entre 0 e 100:");
            System.out.print(">> ");
            nSecreto = input.nextInt();

            if (nSecreto < 0 || nSecreto > 100){
                System.out.println("\n ------ \n");
                System.out.println("\nOps! Valor fora do intervalo válido.");
            }


        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n ------ \n");
        cont = 0;
        n = nSecreto + 1;
        while(n != nSecreto){
            System.out.println("JOGADOR 2: Acerte o valor secreto!");
            System.out.print(">> ");
            n = input.nextInt();
            cont++;

            System.out.println("\n ------ \n");
            if (n > nSecreto){
                System.out.println("\nOps! O valor secreto é MENOR!");
            } else if (n < nSecreto){
                System.out.println("\nOps! O valor secreto é MAIOR!");
            } else {
                System.out.println("\nPARABÉNS! Você acertou o número secreto!");
                System.out.println("Tentativas: " + cont);
            }

        }
    }
}
