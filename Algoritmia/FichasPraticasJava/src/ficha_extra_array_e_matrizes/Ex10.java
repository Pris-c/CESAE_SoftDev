package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex10 {
    /*
        Escreva um programa que permita preencher um array de tamanho 12, seguidamente remova todos os valores
        duplicados. Deve criar um novo array com o tamanho certo.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[12];
        int[] newArray;
        int contDuplicado = 0;
        boolean duplicado = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();

            duplicado = false;
            for (int cont = 0; (cont < i) && !duplicado; cont++){
                if (array[i] == array[cont]){
                    contDuplicado++;
                    duplicado = true;
                }
            }
        }

        System.out.println("\n ------ \n");

        System.out.println("Array inicial:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        newArray = new int[array.length - contDuplicado];

        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            duplicado = false;
            for (int j = 0; (j <= pos) && !duplicado; j++) {
                if (array[i] == newArray[j]){
                    duplicado = true;
                }
            }
            if (!duplicado){
                newArray[pos] = array[i];
                pos++;
            }
        }

        System.out.println("\n ------ \n");

        System.out.println("Array sem repetição:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }


    }

}
