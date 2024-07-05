package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {
    /*
        Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
        número de palavras presentes nesse ficheiro
     */

    public static void main(String[] args) throws FileNotFoundException {
        //imprimirNumeroDeLinhasEPalavras(new File("src/ficha_pratica_07/ficheiros/exercicio_07.txt"));
        File file = new File("src/ficha_pratica_07/ficheiros/exercicio_07.txt");
        System.out.println("Total palavras: " + contarPalavras(file));
        System.out.println("Total linhas: " + contarLinhas(file));
    }

    /**
     * Informa quantas linhas há no ficheiro
     * @param ficheiro File ficheiro a ser analisado
     * @return int com o numero de linhas
     * @throws FileNotFoundException
     */
    public static int contarLinhas(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        int contLinhas = 0;
        while(scanner.hasNext()){
            contLinhas++;
            scanner.nextLine();
        }
        return contLinhas;
    }

    /**
     * Informa quantas palavras há no ficheiro
     * @param ficheiro File ficheiro a ser analisado
     * @return int com o numero de palavras
     * @throws FileNotFoundException
     */
    public static int contarPalavras(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        int contPalavra = 0;
        while(scanner.hasNext()){
            contPalavra += scanner.nextLine().split(" ").length;
        }
        return contPalavra;
    }



    // Alternativa

    /**
     * Calcula e imprime o numero de linhas e de palavras em um ficheiro
     * @param ficheiro File: ficheiro a ser analisado
     * @throws FileNotFoundException
     */
    public static void imprimirNumeroDeLinhasEPalavras(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        int contLinha = 0;
        int contPalavra = 0;
        while(scanner.hasNext()){
            contLinha++;
            contPalavra += scanner.nextLine().split(" ").length;
        }
        System.out.println("Numero de linhas: " + contLinha);
        System.out.println("Numero de palavras: " + contPalavra);
    }

}
