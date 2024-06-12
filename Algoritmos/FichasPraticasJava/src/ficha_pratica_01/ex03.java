package ficha_pratica_01;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int l1, l2, area, perimetro;

        System.out.println("\n-- CALCULA AREA E PERIMETRO DE UM RETANGULO --");

        System.out.print("Informe o valor do lado 1: ");
        l1 = input.nextInt();
        System.out.print("Informe o valor do lado 2: ");
        l2 = input.nextInt();

        area = l1 * l2;
        perimetro = 2 * (l1 + l2);

        System.out.println("\n ------ \n");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

    }
}
