package ficha_pratica_03;

import java.util.Scanner;

public class ex11 {
    /*
        Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
        números inteiros de 0 até limite inclusive, com incremento de salto.
        Suponha que limite e salto são maiores que zero.
        Exemplo:
            Valores lidos: 10 (limite) e 3 (salto)
            Saída do algoritmo: 0 3 6 9
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, limite, salto;

        System.out.println("\n-- IMPRIME VALORES ENTRE 0 E LIMITE, COM SALTO INFORMADO PELO USUÁRIO  --");

        System.out.print("Introduza o valor limite: ");
        limite = input.nextInt();

        System.out.print("Introduza o valor do salto: ");
        salto = input.nextInt();

        System.out.println("\n ------ \n");
        for (int i = 0; i <= limite; i+= salto){
            System.out.println(i);
        }

        /*
        // Resolução com while
            int x;
            x = 0;
            while (x <= limite){
                System.out.println(x);
                x+=salto;
            }
         */


    }
}
