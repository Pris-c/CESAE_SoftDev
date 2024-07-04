package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex11 {
    /*
        Escreva um programa que permita preencher um array de tamanho 15, seguidamente crie dois novos arrays:
        a.Um com os valores pares do array inicial. (0 podemos considerar par)
        b.Um com os valores ímpares do array inicial.
        No final, imprima todos os arrays devidamente identificados.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[12];
        int[] arrayPar, arrayImpar;
        int contPar, contImpar;

        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();

            if (array[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }


        arrayPar = new int[contPar];
        arrayImpar = new int[contImpar];
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayPar[contPar] = array[i];
                contPar++;
            } else {
                arrayImpar[contImpar] = array[i];
                contImpar++;
            }
        }



        System.out.println("\n ------ \n");

        System.out.println("Array inicial:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("\nArray de numeros pares:");
        for (int i = 0; i < arrayPar.length; i++) {
            System.out.print(arrayPar[i] + "\t");
        }

        System.out.println("\nArray de numeros impares:");
        for (int i = 0; i < arrayImpar.length; i++) {
            System.out.print(arrayImpar[i] + "\t");
        }
    }
}
