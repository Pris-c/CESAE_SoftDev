package ficha_pratica_02;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valor;
        int notas;


        System.out.println("\n-- CALCULA MENOR NUMERO DE NOTAS --");
        System.out.print("Informe um valor multiplo de 5: ");
        valor = input.nextInt();

        System.out.println("\n ------ \n");

        if (valor == 0) {
            System.out.println("Valor nulo.");
        } else if ((valor % 5) != 0 || valor < 0) {
            System.out.println("Valor inválido.");
        } else {

            // Notas de 5 10 20 50 100 200
            //if (valor >= 200) {
                notas = valor / 200;
                System.out.println(notas + "\tNotas de € 200");
                valor = valor % 200;
            //}
            //if (valor >= 100) {
                notas = valor / 100;
                System.out.println(notas + "\tNotas de € 100");
                valor = valor % 100;
            //}
            //if (valor >= 50) {
                notas = valor / 50;
                System.out.println(notas + "\tNotas de € 50");
                valor = valor % 50;
            //}
            //if (valor >= 20) {
                notas = valor / 20;
                System.out.println(notas + "\tNotas de € 20");
                valor = valor % 20;
            //}
            //if (valor >= 10) {
                notas = valor / 10;
                System.out.println(notas + "\tNotas de € 10");
                valor = valor % 10;
            //}
            notas = valor;

            //if (notas > 0) {
                notas = valor / 5;
                System.out.println(notas + "\tNotas de € 5");
            //}

        }
    }
}
