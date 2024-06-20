package ficha_pratica_03;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, cont;
        double sum;

        System.out.println("\n-- LÊ NÚMEROS ATÉ QUE SEJA INFORMADO \"-1\" E CALCULA MÉDIA DOS VALORES INSERIDOS  --");
        num = 0;

        // Para correção da soma do ultimo valor lido (-1)
        cont = -1;
        sum = 1;

        while (num != -1) {
            System.out.print("Informe um número inteiro ou digite (-1) para encerrar: ");
            num = input.nextInt();
            cont++;
            sum += num;
        }

        System.out.println("\n ------ \n");
        System.out.println("Média dos valores informados: " + (sum/cont));
    }
}
