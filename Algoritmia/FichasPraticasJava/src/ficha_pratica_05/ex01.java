package ficha_pratica_05;

import java.util.Scanner;

public class ex01 {
    /*
        Implemente um programa que permita adicionar 10 números inteiros a um array
        e que os imprima pela ordem de inserção.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.println("\n ------ \n");

        for (int i = 0; i < array.length; i++){
            System.out.println("Array [" + i + "] = " + array[i]);
        }


    }
}
