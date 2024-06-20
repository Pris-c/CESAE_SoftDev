package ficha_pratica_01;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n1, n2, n3, medArit, medPond;


        final double pond1 = 0.2;
        final double pond2 = 0.3;
        final double pond3 = 0.5;

        System.out.println("\n-- CALCULA MÉDIA ARITMÉTICA E PONDERADA DE 3 VALORES --");

        System.out.print("Informe o primeiro valor: ");
        n1 = input.nextDouble();
        System.out.print("Informe o segundo valor: ");
        n2 = input.nextDouble();
        System.out.print("Informe o terceiro valor: ");
        n3 = input.nextDouble();

        medArit = (n1 + n2 + n3)/3;
        medPond = ( (n1 * pond1) + (n2 * pond2) + (n3 * pond3) ) / (pond1 + pond2 + pond3);

        System.out.println("\n ------ \n");
        System.out.println("Média Aritmética: " + medArit);
        System.out.println("Média Ponderada: " + medPond);

    }
}
