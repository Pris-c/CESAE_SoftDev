package ficha_pratica_05;

import java.util.Scanner;

public class ex05 {
    /*
        Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        double soma, media;
        soma = 0;
        media = 0;

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();

            soma += array[i];
        }
        media = soma / array.length;

        System.out.println("\n ------ \n");
        System.out.println("Media = " + media);

    }
}
