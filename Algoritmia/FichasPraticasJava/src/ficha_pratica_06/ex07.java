package ficha_pratica_06;

import java.util.Scanner;

public class ex07 {
    /*
        Escreva um programa para desenhar um quadrado no ecrã. Esse quadrado deverá ser desenhado por uma
        função para a qual são passados três argumentos: caracter a utilizar, número de linhas e número de colunas.
        Segue-se um exemplo do algoritmo a ser executado, ilustrando o pretendido
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char caracter;
        int linhas, colunas;
        int[][] matriz;

        System.out.print("Introduza um caracter: ");
        caracter = input.nextLine().charAt(0);

        System.out.print("Introduza o numero de linhas: ");
        linhas = input.nextInt();

        System.out.print("Introduza o numero de colunas: ");
        colunas = input.nextInt();


        matriz = new int[linhas][colunas];
        linhas--;
        colunas--;

        for (int i = 0; i <= linhas; i++){
            for (int j = 0; j <= colunas; j++){
                if ((i == 0) || (i == linhas) || (j == 0) || (j == colunas)){
                    System.out.print(caracter+"\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
