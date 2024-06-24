package ficha_extra_ciclos;

import java.util.Scanner;

public class ex07 {
    /*
        Escreva um programa que leia números do utilizador até que este introduza o 0, no fim, apresente a quantidade
        de números negativos e números positivos que o utilizador introduziu.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, contPos, contNeg;
        contPos = 0;
        contNeg = 0;


        System.out.println("\n-- CONTA NUMEROS POSITIVOS E NEGATIVOS --");
        n = -1;
        while (n != 0){
            System.out.print("Informe um numero inteiro ou [0] para encerrar: ");
            n = input.nextInt();

            if (n < 0){
                contNeg++;
            } else if (n > 0) {
                contPos++;
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("POSITIVOS: " + contPos);
        System.out.println("NEGATIVOS: " + contNeg);


    }
}
