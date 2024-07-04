package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex05 {
    /*
        Escreve um programa que permita preencher um array de tamanho 12 e, seguidamente, encontre todos os
        valores que estão duplicados no Array
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[12];
        int[] duplicados = new int[6];
        int contDupl;

        for (int i = 0; i < array.length; i++){
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        contDupl = 0;
        boolean estaSalvo;
        // percorrendo array
        for (int n = 0; n < array.length; n++){
            // comparando n com os outros valores do array
            for (int n1 = n+1; n1 < array.length; n1++){
                // analisa se n é um valor duplicado
                if (array[n] == array[n1]){
                    estaSalvo = false;
                    // verifica se n já consta no array de numeros duplicados
                    for (int i = 0; i < contDupl; i++){
                        if (duplicados[i] == array[n]){
                            estaSalvo = true;
                        }
                    }
                    // Salva n no array de numeros duplicados, se ainda não estiver salvo
                    if (!estaSalvo){
                        duplicados[contDupl] = array[n];
                        contDupl++;
                    }
                }
            }
        }

        System.out.println("\n ------ \n");
        System.out.print("Valores duplicados: ");
        for (int i = 0; i < contDupl; i++){
            System.out.print(duplicados[i] + " ");
        }
    }
}
