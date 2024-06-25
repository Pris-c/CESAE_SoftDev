package ficha_extra_ciclos;

import java.util.Scanner;

public class ex04 {
    /*
        Escreva 3 programas que, através de ciclos, exibam os seguintes padrões (4.1, 4.2, 4.3)
     */
    public static void main(String[] args) {

        /*System.out.println("\n-- PADRÃO 4.1 --");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 4.2 --");
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 4.3 --");
        int espaco = 0;
        for (int i = 1; i <= 9; i+=2){
            espaco = (9 - i) / 2;

            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        // Resolução com numero de linhas escolhido pelo usuário
        Scanner input = new Scanner(System.in);
        int linhas;
        System.out.println("\n-- CRIAÇÃO DE PADRÕES --");
        System.out.println("Escolha o número de linhas a ser impressa para cada padrão:");
        System.out.print(">> ");
        linhas = input.nextInt();

        System.out.println("\n-- PADRÃO 4.1 --");
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 4.2 --");
        for (int i = 1; i <= linhas; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 4.3 --");
        int espaco = 0;
        int contCaracter = 1;

        for (int i = 1; i <= linhas; i++){
            espaco = (((linhas * 2) - 1) - contCaracter)/2;

            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < contCaracter; k++){
                System.out.print("*");
            }

            System.out.println();
            contCaracter += 2;
        }

    }
}
