package ficha_pratica_04;

import java.util.Scanner;

public class ex03 {
    /*
        Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
        acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
        se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
        valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nSecreto, n, cont;

        System.out.println("\n-- NUMERO SECRETO  --");

        do{
            System.out.println("JOGADOR 1: Defina um número secreto entre 0 e 100:");
            System.out.print(">> ");
            nSecreto = input.nextInt();

            if (nSecreto < 0 || nSecreto > 100){
                System.out.println("\n ------ \n");
                System.out.println("Ops! Valor fora do intervalo válido. Tente novamente!");
            }

        } while (nSecreto < 0 || nSecreto > 100);

        // Alternativa para que o valor secreto "desapareça" do terminal antes da vez do JOGADOR 2.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n ------ \n");

        cont = 0;
        do {
            System.out.println("JOGADOR 2: Acerte o valor secreto!");
            System.out.print(">> ");
            n = input.nextInt();
            cont++;

            System.out.println("\n ------ \n");
            if (n > nSecreto){
                System.out.println("Ops! O valor secreto é MENOR!");
            } else if (n < nSecreto){
                System.out.println("Ops! O valor secreto é MAIOR!");
            } else {
                System.out.println("PARABÉNS! Você acertou o número secreto!");
                System.out.println("Tentativas: " + cont);
            }

        } while(n != nSecreto);

    }
}
