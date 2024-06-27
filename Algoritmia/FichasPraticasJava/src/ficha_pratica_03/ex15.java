package ficha_pratica_03;

import java.util.Scanner;

public class ex15 {
    /*
        Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o cicl while.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, fat;

        System.out.println("\n-- FATORIAL  --");
        System.out.print("Introduza um numero natural: ");
        n = input.nextInt();

        if (n < 0){
            System.out.println("\n ------ \n");
            System.out.println("Não existe fatorial de numero negativo!");
        } else {
            fat = 1;
            while(n > 1){
                fat *= n;
                n--;
            }
            System.out.println("\n ------ \n");
            System.out.println("Fatorial: " + fat);
        }


    }
}
