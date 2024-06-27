package ficha_pratica_02;

import java.util.Scanner;

public class ex06 {
    /*
        Escreva um programa que leia dois valores numéricos e apresente o maior e depois o menor.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("\n-- APRESENTA VALORES EM ORDEM DECRESCENTE --");
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        System.out.println("\n ------ \n");
        if (num1 > num2){
            System.out.println(num1 + "\t" + num2);
        } else {
            System.out.println(num2 + "\t" + num1);
        }

    }
}
