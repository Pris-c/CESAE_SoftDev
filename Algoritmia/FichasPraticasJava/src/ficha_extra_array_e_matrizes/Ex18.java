package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex18 {
    /*
        Escreva um programa que pergunta ao utilizador quantas linhas e quantas colunas quer na sua matriz. De
        seguida permita que o utilizador insira números inteiros na matriz criada com as dimensões desejadas.
        Finalmente transponha a matriz

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz, matrizT;
        int linha, coluna;

        System.out.print("Escolha o numero de linhas da sua matriz: ");
        linha = input.nextInt();
        System.out.print("Escolha o numero de colunas da sua matriz: ");
        coluna = input.nextInt();

        matriz = new int[linha][coluna];


        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Insira um numero na Matriz[" + i + "][" + j +"]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\n --- MATRIZ ORIGINAL ---\n");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        matrizT = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

        System.out.println("\n --- MATRIZ TRANSPOSTA ---\n");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
