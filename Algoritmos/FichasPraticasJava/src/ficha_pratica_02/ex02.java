package ficha_pratica_02;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioAnual, imposto;
        final int LIMITE_SAL = 15000;
        final double TAXA_INF = 0.20;
        final double TAXA_SUP = 0.30;

        System.out.println("\n-- CALCULA IMPOSTOS SOBRE SALÁRIO --");
        System.out.print("Informe o valor do salário anual: ");
        salarioAnual = input.nextDouble();

        if (salarioAnual <= LIMITE_SAL){
            imposto = salarioAnual * TAXA_INF;
        } else {
            imposto = salarioAnual * TAXA_SUP;
        }

        System.out.println("\n ------ \n");
        System.out.println("Impostos a pagar: € " + imposto);

    }
}
