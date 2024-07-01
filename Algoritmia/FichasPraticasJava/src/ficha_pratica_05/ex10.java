package ficha_pratica_05;

import java.util.Scanner;

public class ex10 {
    /*
        Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo
        utilizador. Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int n, cont;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Informe um numero para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.print("Insira um número para pesquisar: ");
        n = input.nextInt();

        cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == n){
                    cont++;
                }
            }
        }

        System.out.println("\n ------ \n");
        System.out.println("Há " + cont + " posições com o número " + n);
    }
}
