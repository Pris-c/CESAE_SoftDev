package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex15 {
    /*
        Escreva um programa que lê uma matriz 3x2, de seguida calcule a média dos seus elementos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        float soma = 0;
        float media;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira um numero para Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }

        media = soma / (matriz.length * matriz[0].length);

        System.out.println("\n ------ \n");
        System.out.println("Media = " + media);
        System.out.println();
    }
}
