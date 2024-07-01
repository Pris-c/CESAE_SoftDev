package ficha_pratica_05;

import java.util.Scanner;

public class ex03 {
    /*
        Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int maior;

        System.out.print("Insira um numero no Array [0]: ");
        maior = array[0] = input.nextInt();

        for (int i = 1; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Maior = " + maior);

    }
}
