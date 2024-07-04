package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex07 {
    /*
        Escreva um programa que pergunta ao utilizador o tamanho de um array, seguidamente instancie um array com
        esse tamanho e permita ao utilizador preencher o mesmo. Finalmente, pergunte qual o valor a remover, deve
        remover todas as ocorrências desse valor do array.
        A remoção passa por descobrir quantos elementos terá de remover.
        Seguidamente instanciar um novo array sem essas posições.
        Posteriormente, passar os elementos por ordem para este novo array
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array;
        int n, nRemover, contN;

        System.out.print("Quantos elementos quer inserir no Array: ");
        n = input.nextInt();

        array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.print("Qual elemento deseja remover: ");
        nRemover = input.nextInt();

        contN = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == nRemover){
                contN++;
            }
        }

        System.out.println("\n ------ \n");

        if (contN > 0) {

            int[] newArray = new int[array.length - contN];

            for (int i = 0, newI = 0; i < array.length; i++) {

                if (array[i] != nRemover) {
                    newArray[newI] = array[i];
                    newI++;
                }
            }

            // Arrays funcionam como objeto
            // array passa para apontar para o mesmo endereço de memória do newArray
            // ou seja, ambas variáveis apontam para o mesmo valor
            array = newArray;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Array [" + i + "]: " + array[i]);
        }



/*
            for (int i = 0; i < newArray.length; i++) {
                System.out.println("Array [" + i + "]: " + newArray[i]);
            }

        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Array [" + i + "]: " + array[i]);
            }

        }
*/

    }
}
