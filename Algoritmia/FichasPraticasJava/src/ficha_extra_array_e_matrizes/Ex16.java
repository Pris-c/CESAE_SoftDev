package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex16 {
    /*
        Escreva um programa que lê uma matriz 3x3, de seguida encontre o maior e o menor elemento
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menor, maior;

        menor = maior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Insira um numero na Matriz[" + i + "][" + j +"]: ");
                matriz[i][j] = input.nextInt();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                } else if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Menor = " + menor);
        System.out.println("Maior = " + maior);

    }
}
