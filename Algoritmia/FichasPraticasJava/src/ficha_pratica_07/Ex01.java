package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {
    /*
        Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola
     */

    public static void main(String[] args) {

        System.out.println("\n --- Ficheiro 01 --- \n");
        imprimirFicheiro("src/ficha_pratica_07/ficheiros/exercicio_01.txt");
        System.out.println("\n --- Ficheiro Alternativo 01 --- \n");
        imprimirFicheiro("src/ficha_pratica_07/ficheiros/exercicio_01_Alternativa01.txt");
        System.out.println("\n --- Ficheiro Alternativo 02 --- \n");
        imprimirFicheiro("src/ficha_pratica_07/ficheiros/exercicio_01_Alternativa02.txt");

    }

    /**
     * Imprime conteúdo de texto de um ficheiro
     * @param path String contendo o caminho do ficheiro a ser impresso
     */
    public static void imprimirFicheiro(String path) {

        try{
            Scanner scanner = new Scanner(new File(path));
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException ex){
            System.out.println("ERROR: Ficheiro não encontrado!");
        }
    }

}
