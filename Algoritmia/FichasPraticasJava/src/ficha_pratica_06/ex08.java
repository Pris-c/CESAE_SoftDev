package ficha_pratica_06;

import java.util.Scanner;

public class ex08 {
    /*
        Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão, apresente (numa função) em
        forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz1, matriz2;
        int linhas, colunas;

        System.out.println(" ------- OPERAÇÃO COM MATRIZES ------- ");
        System.out.println("Informe o tamanho das matrizes: ");
        System.out.print("Numero de linhas: ");
        linhas = input.nextInt();
        System.out.print("Numero de colunas: ");
        colunas = input.nextInt();

        /*
            matriz1 = matriz2 = new int[linhas][colunas];
            Na linha acima, ambas as matrizes apontam para os mesmos valores, ou seja,
            são dois nomes de variáveis para a mesma matriz
         */

        matriz1 = new int[linhas][colunas];
        matriz2 = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Insira um numero para Matriz 1 [" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Insira um numero para Matriz 2 [" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        somarMatrizes(matriz1, matriz2);
        somatorioMatrizes(matriz1, matriz2);

    }

    public static void somarMatrizes(int[][] matriz1, int[][] matriz2){
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length){
            System.out.println("\nAs matrizes de tamanhos diferentes.");
        } else {
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

    public static void somatorioMatrizes(int[][] matriz1, int[][] matriz2){
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length){
            System.out.println("As matrizes de tamanhos diferentes.");
        } else {
            int soma = 0;

            for (int i = 0 ; i < matriz1.length; i++ ){
                for (int j = 0 ; j < matriz1[0].length; j++ ){
                    soma += matriz1[i][j] + matriz2[i][j];
                }
            }
            System.out.println("Somatório = " + soma);
            System.out.println();
        }

    }
}
