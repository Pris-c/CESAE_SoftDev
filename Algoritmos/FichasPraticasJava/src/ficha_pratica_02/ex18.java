package ficha_pratica_02;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Valores salario diario
        final double DIARIA_E = 40;
        final double DIARIA_C = 60;
        final double DIARIA_A = 80;

        // Valores Subsidio Alimentação
        final double ALIM = 7.5;
        final double ALIM_E = 5;

        // Faixas IRS
        final double VENC_REF_IRS = 1000;
        final double IRS_FAIXA_1 = 0.10;
        final double IRS_FAIXA_2 = 0.20;

        // Valores SSO
        final double SSO_EMPREG = 0.11;
        final double SSO_ENTIDADE = 0.2375;
        final double SSO_EMPREG_A = 0.09;
        final double SSO_ENTIDADE_A = 0.21;

        int diasTrab;
        String cod, cargo;
        double valorLiqVencimento, totalSubAlim, retIrs, totalSso, valorLiqReceber;
        double ssoEmpreg, ssoEntidade;
        double  totalVenc, diariaCalc, subAlimCalc, ssoEmpCalc, ssoEntidCalc, irsCalc;


        System.out.println("\n-- CALCULA VENCIMENTO DO COLABORADOR --");
        System.out.print("Informe o código do funcionário: ");
        cod = input.next();
        System.out.println("Informe o cargo do funcionário: ");
        System.out.println("E - Empregado");
        System.out.println("C - Chefe");
        System.out.println("A - Administrador");
        System.out.print(">> ");
        cargo = input.next();
        if(cargo.equals("E") || cargo.equals("C") || cargo.equals("A")){

            System.out.print("Informe o número de dias trabalhados: ");
            diasTrab = input.nextInt();

            // Calcular Valores a Receber e SSOs
            if (cargo.equals("E")){
                diariaCalc = DIARIA_E;
                subAlimCalc = ALIM_E;
                ssoEmpCalc = SSO_EMPREG;
                ssoEntidCalc = SSO_ENTIDADE;
            } else if (cargo.equals("C")){
                diariaCalc = DIARIA_C;
                subAlimCalc = ALIM;
                ssoEmpCalc = SSO_EMPREG;
                ssoEntidCalc = SSO_ENTIDADE;
            } else { // cargo = A
                diariaCalc = DIARIA_A;
                subAlimCalc = ALIM;
                ssoEmpCalc = SSO_EMPREG_A;
                ssoEntidCalc = SSO_ENTIDADE_A;
            }

            totalVenc = diasTrab * diariaCalc;
            System.out.println("-- TOTAL VENCIMENTO: " + totalVenc);
            totalSubAlim = diasTrab * subAlimCalc;
            System.out.println("-- TOTAL ALI: " + totalSubAlim);
            ssoEmpreg = totalVenc * ssoEmpCalc;
            System.out.println("-- SSO Empreg: " + ssoEmpreg);
            ssoEntidade = totalVenc * ssoEntidCalc;
            System.out.println("-- SSO Entid: " + ssoEntidade);
            totalSso =  ssoEmpreg + ssoEntidade;
            System.out.println("-- SSO Total: " + totalSso);

            // Calcular IRS valor liquido do vencimento
            if (totalVenc <= VENC_REF_IRS){
                retIrs = totalVenc * IRS_FAIXA_1;
            } else {
                retIrs = totalVenc * IRS_FAIXA_2;
            }
            valorLiqVencimento = totalVenc - retIrs - ssoEmpreg;
            valorLiqReceber = valorLiqVencimento + totalSubAlim;

            System.out.println("\n -- FOLHA FUNCIONÁRIO " + cod + " -- \n");
            System.out.println("Valor liquido a receber fruto do vencimento: € " + valorLiqVencimento);
            System.out.println("Total subsídio alimentação: € " + totalSubAlim);
            System.out.println("Valor da retenção de IRS a entregar ao estado: € " + retIrs);
            System.out.println("Valor total a entregar à Segurança Social: € " + totalSso);
            System.out.println("Valor liquido a receber: € " + valorLiqReceber);

        }

        System.out.println("\n ------ \n");
        System.out.println("Cargo inexistente.");

    }
}
