package ficha_pratica_05;

import java.util.Scanner;

public class ex06 {
    /*
        Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        boolean cres;

        System.out.print("Insira um numero no Array [0]: ");
        array[0] = input.nextInt();

        cres = true;
        for (int i = 1; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();

            if (array[i-1] > array[i]){
                cres = false;
            }
        }

        System.out.println("\n ------ \n");
        if (cres){
            System.out.println("O array está em ordem crescente.");
        } else {
            System.out.println("O array NÃO está em ordem crescente.");
        }

    }
}
