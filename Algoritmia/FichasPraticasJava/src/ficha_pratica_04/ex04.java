package ficha_pratica_04;

import java.util.Scanner;

public class ex04 {
    /*
        Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
        número natural que só possui dois divisores: 1 e ele mesmo). (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, i;
        boolean primo;
        System.out.println("\n-- NUMERO PRIMO  --");

        System.out.print("Digite um numero inteiro: ");
        n = input.nextInt();
        if (n <= 0){
            primo = false;

        } else if (n <= 2){
            primo = true;
        }

        else {
            i = 2;
            primo = true;
            int stop = n/2 + 1;
            while (primo && (i <= stop)){
                if (n % i == 0){
                    primo = false;
                }
                i++;
            }
        }

        System.out.println("\n ------ \n");
        if (primo){
            System.out.println(n + " é um número primo!");
        } else {
            System.out.println(n + " não é um número primo!");
        }

    }
}
