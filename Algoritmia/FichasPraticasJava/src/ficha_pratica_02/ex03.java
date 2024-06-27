package ficha_pratica_02;

import java.util.Scanner;

public class ex03 {
    /*
        Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        a.Salário até 15.000€ inclusive paga taxa de 20%
        b.Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        c.Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        d.Salário superior a 25.000€ paga taxa de 40%
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salarioAnual, taxa, imposto;
        final int LIMITE_SUP_FAIXA1 = 15000;
        final int LIMITE_SUP_FAIXA2 = 20000;
        final int LIMITE_SUP_FAIXA3 = 25000;
        final double TAXA_FAIXA1 = 0.20;
        final double TAXA_FAIXA2 = 0.30;
        final double TAXA_FAIXA3 = 0.35;
        final double TAXA_FAIXA4 = 0.40;

        System.out.println("\n-- CALCULA IMPOSTOS SOBRE SALÁRIO --");
        System.out.print("Informe o valor do salário anual: ");
        salarioAnual = input.nextDouble();

        taxa = TAXA_FAIXA4;
        if (salarioAnual <= LIMITE_SUP_FAIXA1){
            taxa = TAXA_FAIXA1;
        } else if (salarioAnual <= LIMITE_SUP_FAIXA2){
            taxa = TAXA_FAIXA2;
        } else if (salarioAnual <= LIMITE_SUP_FAIXA3) {
            taxa = TAXA_FAIXA3;
        }

        imposto = salarioAnual * taxa;

        System.out.println("\n ------ \n");
        System.out.println("Impostos a pagar: € " + imposto);

    }
}
