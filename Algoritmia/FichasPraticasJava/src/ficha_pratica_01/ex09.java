package ficha_pratica_01;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double VENC_DIA = 40;
        final double SUB_ALIM_DIA = 5;
        final double IRS = 0.10;
        final double SSO_EMPREG = 0.11;
        final double SSO_PATR = 0.2375;
        int diasTrab;
        String cod;
        double valorLiqVenc, totalIrs, totalSso, valorLiqReceber;
        double  totalSubAlim, totalVenc;



        System.out.println("\n-- CALCULA VENCIMENTO DO COLABORADOR --");
        System.out.print("Informe o código do funcionário: ");
        cod = input.next();
        System.out.print("Informe o número de dias trabalhados: ");
        diasTrab = input.nextInt();

        totalVenc = diasTrab * VENC_DIA;
        totalSubAlim = diasTrab * SUB_ALIM_DIA;

        valorLiqVenc = totalVenc * (1 - IRS - SSO_EMPREG);
        totalIrs = totalVenc * IRS;
        totalSso = totalVenc * (SSO_EMPREG + SSO_PATR);
        valorLiqReceber = valorLiqVenc + totalSubAlim;

        System.out.println("\n -- FOLHA FUNCIONÁRIO " + cod + " -- \n");
        System.out.println("Valor liquido a receber fruto do vencimento: € " + valorLiqVenc);
        System.out.println("Total subsídio alimentação: € " + totalSubAlim);
        System.out.println("Valor da retenção de IRS a entregar ao estado: € " + totalIrs);
        System.out.println("Valor total a entregar à Segurança Social: € " + totalSso);
        System.out.println("Valor liquido a receber: € " + valorLiqReceber);

    }
}
