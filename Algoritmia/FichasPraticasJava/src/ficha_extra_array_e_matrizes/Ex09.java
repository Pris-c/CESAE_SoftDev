package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex09 {
    /*
        Escreva um programa que permita preencher um array de tamanho 10, seguidamente ordene o mesmo por
        ordem crescente.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.println("\n ------ \n");

        System.out.println("Array inicial:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }


        // Bubble Sort
        boolean ordered = false;

        while (!ordered){
            ordered = true;
            for (int i = 0; i < array.length-1; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < array[i]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        ordered = false;
                    }
                }
            }
        }

        System.out.println("\nArray ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
