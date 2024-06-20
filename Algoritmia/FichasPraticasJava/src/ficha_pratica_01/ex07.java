package ficha_pratica_01;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, totalPagar;
        final double DESCONTO = 0.10;

        System.out.println("\n-- CALCULA VALOR DA COMPRA --");

        System.out.print("Informe o valor do produto 1: ");
        preco1 = input.nextDouble();

        System.out.print("Informe o valor do produto 2: ");
        preco2 = input.nextDouble();

        System.out.print("Informe o valor do produto 3: ");
        preco3 = input.nextDouble();

        totalPagar = (preco1 + preco2 + preco3) * (1 - DESCONTO);

        System.out.println("\n ------ \n");
        System.out.println("Total a pagar: € " + totalPagar);
    }
}
