package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex14 {
    /*
        Escreva um programa que lê uma matriz 3x3 e outra 3x3, de seguida crie uma terceira matriz 3x3 com a soma
        dos elementos respetivos.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz1, matriz2, matrizSoma;

        matriz1 = new int[3][3];
        matriz2 = new int[3][3];
        matrizSoma = new int[3][3];



        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("Insira um numero para Matriz 1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("Insira um numero para Matriz 2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        System.out.println("\n --- MATRIZ 1 ---");
        for (int i = 0 ; i < matriz1.length; i++ ){
            for (int j = 0 ; j < matriz1[0].length; j++ ){
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n --- MATRIZ 2 ---");
        for (int i = 0 ; i < matriz2.length; i++ ){
            for (int j = 0 ; j < matriz2[0].length; j++ ){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n --- MATRIZ SOMA ---");
        int n = 0;

        for (int i = 0 ; i < matriz1.length; i++ ){
            for (int j = 0 ; j < matriz1[0].length; j++ ){
                n = matriz1[i][j] + matriz2[i][j];
                System.out.print(n + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }

}
