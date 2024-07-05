package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex13 {
    /*
        Escreva um programa que permita adicionar 12 números inteiros (ler input do utilizador) a uma matriz 4x3 e
        que imprima com o seguinte aspeto gráfico:
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int [4][3];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Informe um numero para a posição [" + i +"][" + j +"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n ------ \n");

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
