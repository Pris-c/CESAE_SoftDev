package ficha_pratica_05;

import java.util.Scanner;

public class ex04 {
    /*
        Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int menor;

        System.out.print("Insira um numero no Array [0]: ");
        menor = array[0] = input.nextInt();

        for (int i = 1; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
            if (array[i] < menor){
                menor = array[i];
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Menor = " + menor);

    }
}
