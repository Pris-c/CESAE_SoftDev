package ficha_pratica_03;

import java.util.Scanner;

public class ex07 {
    /*
        Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
        seu somatório. (Não necessita de Scanner ou input do utilizador)
     */

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS DE 1 A 100 E O SOMATÓRIO DOS VALORES --");
        int sum;
        sum = 0;

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("\nSomatório = " + sum);

    }
}
