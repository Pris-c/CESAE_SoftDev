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

        n = -1;
        while (n <= 0){
            System.out.print("Digite um numero inteiro positivo: ");
            n = input.nextInt();

            if (n <= 0){
                System.out.println("Valor inválido. Tente novamente!");
            }
        }

        i = 2;
        primo = true;
        int stop = n/2 + 1;
        while (primo && (i <= stop) ){
            if (n % i == 0){
                primo = false;
            }
            i++;
        }

        System.out.println("\n ------ \n");
        if (primo){
            System.out.println(n + " é um número primo!");
        } else {
            System.out.println(n + " não é um número primo!");
        }
    }
}
