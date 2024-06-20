package ficha_pratica_03;

import java.util.Scanner;

public class ex06 {

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
