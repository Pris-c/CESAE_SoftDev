package ficha_pratica_03;

import java.util.Scanner;

public class ex15e {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, n1, total, soma, i;

        System.out.println("\n-- FATORIAL  --");
        System.out.print("Introduza um numero inteiro: ");
        n = input.nextInt();
        total = n;

        while (n > 2){

            // multiplicar: total * (n-1)
            n1 = n - 1;
            i = 0;
            soma = 0;
            while (i < n1){
                soma += total;
                i++;
            }
            total = soma;
            n--;
        }
        System.out.println("\n ------ \n");
        System.out.println("Fatorial: " + total);

    }

}
