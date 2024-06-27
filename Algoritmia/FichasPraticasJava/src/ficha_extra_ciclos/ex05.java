package ficha_extra_ciclos;

import java.util.Scanner;

public class ex05 {
    /*
        Escreva 3 programas que exibam os seguintes padrões (5.1, 5.2, 5.3)
     */

    public static void main(String[] args) {

/*      System.out.println("\n-- PADRÃO 5.1 --");
        for (int i = 1; i <= 4; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 5.2 --");
        // j = numero a ser impresso
        // espacos = 9 - i
        int espaco = 0;
        for (int i = 1, j = 1; i <= 9; i+=2, j++){
            espaco = (9 - i) / 2;

            for (int l = 0; l < espaco; l++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 5.3 --");
        // maxLinha
        // maxCaracter
        // i = linha | contador
        // nCaracter = numero de caracteres impressos
        // espaco = (maxLinha - nCaracter) / 2
        // j = contador espaço
        int maxLinha = 5;
        int maxCaracter = (linhas * 2) - 1;
        for (int i = 1, nCaracter = 1; i <= maxLinha; i++, nCaracter += 2){
            espaco = (maxCaracter - nCaracter) /2;

            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }
            // k = caracter a ser impresso
            int k = i;
            while (k > 1){
                System.out.print(k);
                k--;
            }
            while (k <= i){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }*/

        // Resolução com numero de linhas escolhido pelo usuário
        Scanner input = new Scanner(System.in);
        int linhas, espaco;
        System.out.println("\n-- CRIAÇÃO DE PADRÕES --");
        System.out.println("Escolha o número de linhas a ser impressa para cada padrão (1 a 9):");
        System.out.print(">> ");
        linhas = input.nextInt();
        linhas =  linhas < 1 ? 1 : linhas;
        linhas =  linhas > 9 ? 9 : linhas;

        System.out.println("\n-- PADRÃO 5.1 --");
        for (int i = 1; i <= linhas; i++){

            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 5.2 --");
        // linha = maxLinha;
        // maxCaracter = 1 + ((linha -1) * 2 )
        // nCaracter = numero de caracteres impressor (+=2)
        // espacos = (maxCaracter - nCaracter) / 2;
        // i = contador linhas
        int maxCaracter;
        for (int i = 1, nCaracter = 1; i <= linhas; i++, nCaracter+=2){
            maxCaracter = (linhas*2) -1;
            espaco = (maxCaracter - nCaracter) / 2;
            // l = contador espaçoes
            for (int l = 0; l < espaco; l++){
                System.out.print(" ");
            }
            // k = contador caracter
            for (int k = 0; k < nCaracter; k++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n-- PADRÃO 5.3 --");
        // linhas = maxLinha
        // maxCaracter
        // i = linha | contador
        // nCaracter = numero de caracteres impressos
        // espaco = (maxCaracter - nCaracter) / 2
        // j = contador espaço
        maxCaracter = (linhas * 2) - 1;

        for (int i = 1, nCaracter = 1; i <= linhas; i++, nCaracter += 2){
            espaco = (maxCaracter - nCaracter) / 2;

            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }
            // k = caracter a ser impresso
            int k = i;
            while (k > 1){
                System.out.print(k);
                k--;
            }
            while (k <= i){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }

    }
}
