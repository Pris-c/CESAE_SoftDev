package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    /*
        Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
        calcule a soma desses números
     */

    public static void main(String[] args) throws FileNotFoundException {

        int soma1 = calcularSoma(new File("src/ficha_pratica_07/ficheiros/exercicio_05_31.txt"));
        int soma2 = somarNumerosFicheiro(new File("src/ficha_pratica_07/ficheiros/exercicio_05_1999.txt"));

        System.out.println("Soma ficheiro 1 = " + soma1);
        System.out.println("Soma ficheiro 2 = " + soma2);

    }

    /**
     * Calcula soma dos valores inteiros contidos em um ficheiro
     * @param ficheiro File: ficheiro a ter conteúdo somado
     * @return soma: int com o valor da soma dos valores
     * @throws FileNotFoundException
     */
    public static int calcularSoma(File ficheiro) throws FileNotFoundException {
        int soma = 0;
        Scanner scanner = new Scanner(ficheiro);
        while(scanner.hasNext()){
            String[] valoresString = scanner.nextLine().split(" ");
            for (int i = 0; i < valoresString.length; i++){
                soma += Integer.parseInt(valoresString[i]);
            }
        }
        return soma;
    }


    // Alternativa
    public static int somarNumerosFicheiro(File ficheiro) throws FileNotFoundException {
        int soma = 0;
        Scanner scanner = new Scanner(ficheiro);
        while(scanner.hasNextInt()){
            soma += scanner.nextInt();
        }
        return soma;
    }

}
