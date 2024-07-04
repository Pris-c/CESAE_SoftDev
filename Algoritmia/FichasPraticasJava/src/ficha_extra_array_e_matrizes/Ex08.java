package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex08 {
    /*
        Escreva um programa que pergunta ao utilizador o tamanho de um array, seguidamente instancie um array com
        esse tamanho e permita ao utilizador preencher o mesmo. Finalmente, pergunte um novo valor e em que
        posição quer colocar.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array;
        int tamanho, novoValor, posicao;

        System.out.print("Quantos elementos quer inserir no Array: ");
        tamanho = input.nextInt();

        array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }


        System.out.println("\n ------ \n");
        for (int i = 0; i < array.length; i++){
            System.out.println("Array [" + i + "]: " + array[i]);
        }

        System.out.print("\nNovo Valor: ");
        novoValor = input.nextInt();
        System.out.print("Índice do novo valor (0 - " + (tamanho-1) +"): ");
        posicao = input.nextInt();

        if (posicao < 0 || posicao >= tamanho){
            System.out.println("Posição inválida");
        } else {
            int[] newArray = new int[++tamanho];

            for (int i = 0; i < posicao; i++){
                newArray[i] = array[i];
            }

            newArray[posicao] = novoValor;

            // i = indice array inicial
            for (int i = posicao; i < array.length; i++){
                newArray[i+1] = array[i];
            }

            System.out.println("\n ------ \n");
            for (int i = 0; i < tamanho; i++){
                System.out.println("Array [" + i + "]: " + newArray[i]);
            }
        }
    }
}
