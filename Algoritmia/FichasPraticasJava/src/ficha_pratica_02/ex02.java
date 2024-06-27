package ficha_pratica_02;

import java.util.Scanner;

public class ex02 {
    /*
    Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
    a.Salário até 15.000€ inclusive paga taxa de 20%
    b.Salário superior a 15.000€ paga taxa de 30%
     */

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
