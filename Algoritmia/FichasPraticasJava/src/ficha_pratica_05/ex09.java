package ficha_pratica_05;

import java.util.Scanner;

public class ex09 {
    /*
        Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe um numero para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Soma = " + soma);
    }
}
