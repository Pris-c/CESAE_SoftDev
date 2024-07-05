package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {
    /*
        Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro
     */

    public static void main(String[] args) throws IOException {

        File ficheiro1 = new File("src/ficha_pratica_07/ficheiros/exercicio_03.txt");
        File ficheiro2 = new File("src/ficha_pratica_07/ficheiros/exercicio_03_transferido.txt");
        transferirConteudoFicheiro(ficheiro1, ficheiro2);

        File ficheiro3 = new File("src/ficha_pratica_07/ficheiros/exercicio_03_Alternativa01.txt");
        File ficheiro4 = new File("src/ficha_pratica_07/ficheiros/exercicio_03_Alternativa01_transferido.txt");
        transferirConteudoFicheiro(ficheiro3, ficheiro4);

    }


    public static void transferirConteudoFicheiro(File ficheiro1, File ficheiro2) throws IOException {
        escreverEmFicheiro(ficheiro2, lerFicheiro(ficheiro1));
    }

    /**
     * Lê conteúdo de um ficheiro e salva em uma String
     * @param ficheiro File: arquivo a ser lido
     * @return String contendo o conteúdo do ficheiro lido
     * @throws FileNotFoundException se o ficheiro a ser lido nõo for encontrado
     */
    public static String lerFicheiro(File ficheiro) throws FileNotFoundException {
        String conteudo = "";
        Scanner scanner = new Scanner(ficheiro);
        while (scanner.hasNext()){
            conteudo += scanner.nextLine() +"\n";
        }
        return conteudo;
    }

    /**
     * Grava conteúdo em ficheiro
     * @param ficheiro File: arquivo a receber gravação
     * @param conteudo String: conteudo textual a ser gravado
     * @throws IOException
     */
    public static void escreverEmFicheiro(File ficheiro, String conteudo) throws IOException {
        PrintWriter writer = new PrintWriter(ficheiro);
        writer.println(conteudo);
        writer.close();
    }

}
