package ficha_pratica_05;

import java.util.Scanner;

public class ex07_1 {
        /*
            Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par
            inserido. Caso não exista, deverá informar o utilizador.

            -- Solução inicializando o maiorPar com o primeiro numero informado pelo utilizador --
        */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int maiorPar;

        System.out.print("Insira um numero no Array [0]: ");
        maiorPar = array[0] = input.nextInt();

        for (int i = 1; i < array.length; i++) {
            System.out.print("Insira um numero no Array [" + i + "]: ");
            array[i] = input.nextInt();

            if (array[i] % 2 == 0) {

                if ((maiorPar % 2 == 0)) {
                    if ((array[i] > maiorPar)) {
                        maiorPar = array[i];
                    }

                } else {
                    maiorPar = array[i];
                }
            }
        }

        System.out.println("\n ------ \n");
        if (maiorPar % 2 == 0) {
            System.out.println("Maior numero par: " + maiorPar);

        } else {
            System.out.println("Não foi informado nenhum numero par.");
        }

    }
}
