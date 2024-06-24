package ficha_pratica_04;

import java.util.Scanner;

public class ex04 {
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

        i = n - 1;
        primo = true;
        while (primo && (i > 1)){

            while (i > 1){

                if (n % i == 0){
                    primo = false;
                }
                i--;
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
