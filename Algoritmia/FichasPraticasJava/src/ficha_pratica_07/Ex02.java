package ficha_pratica_07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex02 {
    /*
         Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.
     */
    public static void main(String[] args) throws IOException {
        escreverEmFicheiro("ficheiroEx02", "Hello, CESAE!");
    }

    /**
     * Grava conteúdo em ficheiro a ser criado no caminho "src/ficha_pratica_07/"
     * @param nomeDoFicheiro String: nome do arquivo txt a ser criado
     * @param conteudo String: conteudo textual a ser gravado
     * @throws IOException
     */
    public static void escreverEmFicheiro(String nomeDoFicheiro, String conteudo) throws IOException {
        PrintWriter writer = new PrintWriter(new File("src/ficha_pratica_07/ficheiros/" + nomeDoFicheiro + ".txt"));
        writer.println(conteudo);
        writer.close();
    }


}
