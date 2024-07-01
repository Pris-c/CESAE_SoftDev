package ficha_pratica_05;

import java.util.Scanner;

public class ex02 {
    /*
        Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (uma posição
        para cada mês) e calcular o seu total anual
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] comissao = new double[12];
        int mes, soma;
        mes = 1;
        soma = 0;

        for (int i = 0; i < comissao.length; i++){
            System.out.print("Informe a comissão do mês " + mes + ": ");
            comissao[i] = input.nextDouble();
            mes++;
            soma += comissao[i];
        }

        System.out.println("\n ------ \n");
        System.out.println("Total anual = " + soma);

    }

}
