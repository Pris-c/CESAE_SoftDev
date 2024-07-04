package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex03 {
    /*
        Escreva um programa que permita preencher um array de tamanho 10 e, seguidamente, pesquisar se o Array
        tem determinado valor
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int n;
        boolean nExiste = false;

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.print("\nInforme o número a pesquisar: ");
        n = input.nextInt();

        for (int i = 0; i < array.length && !nExiste; i++){
            if (array[i] == n){
                nExiste = true;
            }
        }

        System.out.println("\n ------ \n");
        if (nExiste){
            System.out.println(n + " existe no array.");
        } else {
            System.out.println(n + " não existe no array.");
        }
    }
}
