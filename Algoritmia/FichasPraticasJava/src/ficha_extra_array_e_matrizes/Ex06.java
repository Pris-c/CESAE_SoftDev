package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex06 {
    /*
        Escreva um programa que pergunta ao utilizador o tamanho de um array, seguidamente instancie um array com
        esse tamanho e permita ao utilizador preencher o mesmo. No fim, imprima pela ordem de inserção.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array;
        int n;

        System.out.print("Quantos elementos quer inserir no Array: ");
        n = input.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.println("\n ------ \n");
        for (int i = 0; i < n; i++){
            System.out.println("Array [" + i + "]: " + array[i]);
        }

    }
}
