package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    /*
        Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
        imprima o nome da pessoa mais velha na consola.
     */

    public static void main(String[] args) throws FileNotFoundException {
        String pessoaMaisVelha = encontrarPessoaMaisVelha(new File("src/ficha_pratica_07/ficheiros/exercicio_06.txt"));
        System.out.println("A pessoa mais velha da lista é: " + pessoaMaisVelha);
    }

    /**
     * Informa nome da pessoa mais velha num ficheiro contendo nomes e idades separados por virgula
     * @param ficheiro File: ficheiro com as informações a serem analisadas
     * @return String: nome da pessoa de maior idade
     * @throws FileNotFoundException
     */
    public static String encontrarPessoaMaisVelha(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        String nome = "Falhou!";
        int maiorIdade = 0;
        int idade = 0;

        while(scanner.hasNext()){
            String[] splitedLinha = scanner.nextLine().split(",");
            idade = Integer.parseInt(splitedLinha[1]);
            if (idade > maiorIdade){
                maiorIdade = idade;
                nome = splitedLinha[0];
            }
        }
        return nome;
    }
}
