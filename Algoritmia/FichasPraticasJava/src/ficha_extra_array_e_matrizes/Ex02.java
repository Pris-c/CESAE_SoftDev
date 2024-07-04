package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex02 {
    /*
        Escreva um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
        inversa de inserção
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.println("\n ------ \n");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println("Array [" + i + "] = " + array[i]);
        }
    }

}
