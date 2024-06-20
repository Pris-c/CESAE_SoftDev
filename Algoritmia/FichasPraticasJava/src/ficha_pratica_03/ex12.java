package ficha_pratica_03;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, contInter1, contInter2, contInter3, contInter4;

        System.out.println("\n-- CONTA QTD DE NUMEROS EM CADA INTERVALO  --");

        /*
        [0, 25]
        [26, 50]
        [51, 75]
        [76, 100]
         */

        n = 0;
        contInter1 = 0;
        contInter2 = 0;
        contInter3 = 0;
        contInter4 = 0;

        while (n >= 0){

            System.out.print("Introduza um valor inteiro positivo: ");
            n = input.nextInt();

            if (n >=0 && n < 26){
                contInter1++;
            } else if (n < 51){
                contInter2++;
            } else if (n < 76) {
                contInter3++;
            } else if (n <= 100 ) {
                contInter4++;
            }
        }

        System.out.println("\n ------ \n");

        System.out.println("[00, 25]: " + contInter1);
        System.out.println("[26, 50]: " + contInter2);
        System.out.println("[51, 75]: " + contInter3);
        System.out.println("[76, 100]: " + contInter4);

    }
}
