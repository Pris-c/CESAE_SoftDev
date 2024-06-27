package ficha_pratica_02;

import java.util.Scanner;

public class ex17 {
    /*
    Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
    saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
    especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.
    Saldo MédioPercentagem
    De 0 a 2000 (inclusive) - Nenhum crédito
    De 2000 a 4000 (inclusive) - 20% do valor do saldo médio
    De 4000 a 6000 (inclusive) - 30% do valor do saldo médio
    Acima de 6000 - 40% do valor do saldo médio
     */

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
