package ficha_pratica_03;

import java.util.Scanner;

public class ex15e {
    /*
        Desafio Extra: Refazer o exercício 15 com a proibição de usar o operador da multiplicação.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, n1, total, soma, i;

        System.out.println("\n-- FATORIAL  --");
        System.out.print("Introduza um numero natural: ");
        n = input.nextInt();

        if (n < 0){
            System.out.println("\n ------ \n");
            System.out.println("Não existe fatorial de numero negativo!");
        } else {
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
}
