package ficha_pratica_05;

import java.util.Scanner;

public class ex08 {
    /*
        Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3
        e que os imprima com o seguinte aspeto gráfico:
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int [3][3];

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
