package ficha_pratica_03;

import java.util.Scanner;

public class ex04 {
    /*
        Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.
     */

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS DE 0 ATÉ O VALOR ESCOLHIDO PELO USUÁRIO --");

        Scanner input = new Scanner(System.in);
        int numLim;

        System.out.print("Informe o número limite: ");
        numLim = input.nextInt();

        System.out.println("\n ------ \n");
        for (int i = 0; i <= numLim; i++){
            System.out.println(i);
        }


        /*
            // Solução 2
            i = 0;
            while(i <= numLim){
                System.out.println(i++);
            }
        */


    }
}
