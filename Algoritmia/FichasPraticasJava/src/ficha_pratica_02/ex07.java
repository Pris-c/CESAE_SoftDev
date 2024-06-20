package ficha_pratica_02;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("\n-- INFORMA SE VALOR É PAR OU IMPAR --");
        System.out.print("Introduza um número inteiro: ");
        num = input.nextInt();

        System.out.println("\n ------ \n");
        if (num % 2 == 0) {
            System.out.println(num + " é um número PAR.");
        } else {
            System.out.println(num + " é um número IMPAR.");
        }

    }
}
