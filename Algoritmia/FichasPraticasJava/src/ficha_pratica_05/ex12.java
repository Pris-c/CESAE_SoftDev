package ficha_pratica_05;

import java.util.Scanner;

public class ex12 {
    /*
        Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira
        junto aos elementos da segunda
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[][] matriz = new int[5][2];

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira um número no Array1[" + i + "]: ");
            matriz[i][0] = array1[i] = input.nextInt();

        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Insira um número no Array2[" + i + "]: ");
            matriz[i][1] = array2[i] = input.nextInt();
        }

        System.out.println("\n ------ \n");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
