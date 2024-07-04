package ficha_extra_array_e_matrizes;

import java.util.Scanner;

public class Ex12 {
    /*
        Escreva um programa que permita preencher dois arrays de tamanho 8. Seguidamente, crie um novo array
        contendo apenas os valores que estão presentes em ambos os arrays iniciais (este array deve ter o tamanho
        adequado).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array1 = new int[8];
        int[] array2 = new int[8];
        int[] arrayRepetidos = new int[8];;
        int[] arrayRepetidosTamanho;
        boolean existe;

        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira um numero no Array1 [" + i + "]: ");
            array1[i] = input.nextInt();
        }

        boolean repetido = false;
        int pos = 0;
        for (int posArr2 = 0; posArr2 < array2.length; posArr2++) {
            existe = false;
            System.out.print("Insira um numero no Array2 [" + posArr2 + "]: ");
            array2[posArr2] = input.nextInt();

            // Verifica se o numero existe no array1
            for (int posArr1 = 0; posArr1 < array1.length && !existe; posArr1++){
                if (array2[posArr2] == array1[posArr1]){
                    repetido = false;
                    // Verifica se o numero existe no novo array
                    for (int posArrRep = 0; (posArrRep <= pos) && !repetido; posArrRep++){
                        if (array2[posArr2] == arrayRepetidos[posArrRep]){
                            repetido = true;
                        }
                    }
                    if (!repetido){
                        arrayRepetidos[pos] = array2[posArr2];
                        pos++;
                        existe = true;
                    }
                }
            }
        }

        arrayRepetidosTamanho = new int[pos];
        for (int i = 0; i < arrayRepetidosTamanho.length; i++){
            arrayRepetidosTamanho[i] = arrayRepetidos[i];
        }

        System.out.println("\n ------ \n");

        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        System.out.println("\nArray 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }

        System.out.println("\nArray de numeros repetidos:");
        for (int i = 0; i < arrayRepetidosTamanho.length; i++) {
            System.out.print(arrayRepetidosTamanho[i] + "\t");
        }

    }

}
