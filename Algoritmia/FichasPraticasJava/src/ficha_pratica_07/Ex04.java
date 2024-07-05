package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {
    /*
        Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
        consola
     */

    public static void main(String[] args) throws FileNotFoundException {
        imprimirFicheiroCSV(new File("src/ficha_pratica_07/ficheiros/exercicio_04.csv"));
    }


    /**
     * Imprime conteudo de um ficheiro do tipo CSV na consola
     * @param ficheiro: File a ser impresso
     * @throws FileNotFoundException
     */
    public static void imprimirFicheiroCSV(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

}
