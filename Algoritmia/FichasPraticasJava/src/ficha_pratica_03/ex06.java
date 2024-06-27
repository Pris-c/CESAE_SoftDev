package ficha_pratica_03;

import java.util.Scanner;

public class ex06 {
    /*
        Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        imprima os números inteiros neste intervalo.
     */

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS NO INTERVALO DEFINIDO --");
        Scanner input = new Scanner(System.in);
        int inicio, fim;

        System.out.print("Informe o valor inicial: ");
        inicio = input.nextInt();

        System.out.print("Informe o valor final: ");
        fim = input.nextInt();

        System.out.println("\n ------ \n");

        while (inicio <= fim){
            System.out.println(inicio);
            inicio++;
        }

    }
}
