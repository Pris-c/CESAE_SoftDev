package ficha_pratica_03;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, fat;

        System.out.println("\n-- FATORIAL  --");
        System.out.print("Introduza um numero inteiro: ");
        n = input.nextInt();

        fat = 1;
        while(n > 1){
             fat *= n;
             n--;
        }

        System.out.println("\n ------ \n");
        System.out.println("Fatorial: " + fat);

    }

}
