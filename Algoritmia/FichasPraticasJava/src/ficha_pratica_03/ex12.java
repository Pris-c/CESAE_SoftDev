package ficha_pratica_03;

import java.util.Scanner;

public class ex12 {
    /*
        Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
        utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
        dados deve terminar quando for lido um número negativo.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, contInter1, contInter2, contInter3, contInter4;

        System.out.println("\n-- CONTA QTD DE NUMEROS EM CADA INTERVALO  --");
        n = 0;
        contInter1 = 0;
        contInter2 = 0;
        contInter3 = 0;
        contInter4 = 0;

        while (n >= 0){

            System.out.print("Introduza um valor inteiro positivo: ");
            n = input.nextInt();
            if (n >= 0) {
                if (n <= 25) {
                    contInter1++;
                } else if (n <= 50) {
                    contInter2++;
                } else if (n <= 75) {
                    contInter3++;
                } else if (n <= 100) {
                    contInter4++;
                }
            }
        }

        System.out.println("\n ------ \n");

        System.out.println("[00, 25]: " + contInter1);
        System.out.println("[26, 50]: " + contInter2);
        System.out.println("[51, 75]: " + contInter3);
        System.out.println("[76, 100]: " + contInter4);

    }
}
