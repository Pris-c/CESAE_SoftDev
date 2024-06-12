package ficha_pratica_01;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area;
        final double PI = 3.14;

        System.out.println("\n-- CALCULA ÁREA DA CIRCUNFERÊNCIA --");

        System.out.print("Informe o valor do raio: ");
        raio = input.nextDouble();

        area = PI * (raio*raio);

        System.out.println("\n ------ \n");
        System.out.println("Área: " + area);

    }
}
