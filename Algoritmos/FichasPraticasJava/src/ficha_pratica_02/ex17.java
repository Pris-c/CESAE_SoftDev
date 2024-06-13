package ficha_pratica_02;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        double saldoMed, cred;

        final int MIN = 2001;
        final int MAX_FAIXA_1 = 4000;
        final int MAX_FAIXA_2 = 6000;
        final double BASE_FAIXA_1 = 0.2;
        final double BASE_FAIXA_2 = 0.3;
        final double BASE_FAIXA_3 = 0.4;

        System.out.println("\n-- CALCULA CRÉDITO ESPECIAL --");
        System.out.print("Informe o valor do saldo médio: ");
        saldoMed = input.nextInt();

        if (saldoMed < MIN){
            cred = 0;
        } else if (saldoMed <= MAX_FAIXA_1){
            cred = saldoMed * BASE_FAIXA_1;
        } else if (saldoMed <= MAX_FAIXA_2){
            cred = saldoMed * BASE_FAIXA_2;
        } else {
            cred = saldoMed * BASE_FAIXA_3;
        }

        System.out.println("\n ------ \n");
        System.out.println("Saldo Médio:\t€ "  + saldoMed);
        System.out.println("Crédito:\t€ "  + cred);


    }
}
