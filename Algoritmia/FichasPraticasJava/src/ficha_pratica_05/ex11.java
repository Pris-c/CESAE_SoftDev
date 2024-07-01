package ficha_pratica_05;

import java.util.Scanner;

public class ex11 {
    /*
        Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá
        imprimir t*odo o conteúdo da matriz de forma semelhante ao exercício 8
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior, menor;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Informe um numero para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        maior = menor = matriz[0][0];

        System.out.println("\n ------ \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);


    }
}
