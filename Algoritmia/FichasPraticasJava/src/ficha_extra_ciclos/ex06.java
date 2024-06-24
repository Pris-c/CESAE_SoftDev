package ficha_extra_ciclos;

import java.util.Scanner;

public class ex06 {
    /*
        Escreva um programa que leia números do utilizador até que este introduza o 0, no fim, apresente o menor e o
        maior número introduzido (excluindo o 0).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, maior, menor;
        maior = 0;
        menor = 0;


        System.out.println("\n-- INFORMA MAIOR NUMERO --");
        System.out.print("Informe um numero inteiro ou [0] para encerrar: ");
        n = input.nextInt();

        if (n != 0){
            maior = menor = n;
            while (n != 0){
                System.out.print("Informe um numero inteiro ou [0] para encerrar: ");
                n = input.nextInt();

                if ((n!=0) && n < menor){
                    menor = n;
                } else if (n > maior) {
                    maior = n;
                }
            }
        }


        System.out.println("\n ------ \n");
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);


    }
}