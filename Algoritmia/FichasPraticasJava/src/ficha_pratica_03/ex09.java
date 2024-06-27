package ficha_pratica_03;

import java.util.Scanner;

public class ex09 {
    /*
        Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        deve dizer a média dos números introduzidos (excluindo o -1).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, cont;
        double sum, media;

        System.out.println("\n-- LÊ NÚMEROS ATÉ QUE SEJA INFORMADO \"-1\" E CALCULA MÉDIA DOS VALORES INSERIDOS  --");
        num = 0;
        // cont = -1 e cum = 1:  Para correção da soma do ultimo valor lido (-1)
        cont = -1;
        sum = 1;

        while (num != -1) {
            System.out.print("Informe um número inteiro ou digite (-1) para encerrar: ");
            num = input.nextInt();
            cont++;
            sum += num;
        }

        media = sum/cont;
        System.out.println("\n ------ \n");
        System.out.println("Média dos valores informados: " + media);
    }
}
