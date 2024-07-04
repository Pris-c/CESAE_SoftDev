package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex04 {
    /*
        Escreva um programa que permita preencher um array de tamanho 10 e, seguidamente, pesquisar se o Array
        tem um determinado valor. No final deve indicar se o valor existe ou não, e caso exista, indique também o
        índice de todas as ocorrências
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int[] indices = new int[10];
        int n, indI;
        boolean nExiste = false;

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.print("\nInforme o número a pesquisar: ");
        n = input.nextInt();

        System.out.println("\n ------ \n");

        indI = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                indices[indI] = i;
                indI++;
                nExiste = true;
            }
        }

        if (nExiste){
            for (int i = 0; i < indI; i++){
                System.out.println("Array["  +  indices[i] +  "]");
            }
        } else {
            System.out.println(n + " não existe no array.");
        }
    }
}
