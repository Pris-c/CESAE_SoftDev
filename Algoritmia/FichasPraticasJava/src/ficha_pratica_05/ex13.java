package ficha_pratica_05;

import java.util.Scanner;

public class ex13 {
    /*
        Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos elementos da diagonal principal
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma;


        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe um numero para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                if (i==j){
                    soma += matriz[i][i];
                }
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Soma: " + soma);

    }
}
