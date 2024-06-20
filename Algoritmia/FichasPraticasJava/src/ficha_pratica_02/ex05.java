package ficha_pratica_02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("\n-- APRESENTA VALORES EM ORDEM CRESCENTE --");
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();

        System.out.println("\n ------ \n");
        if (num1 > num2){
            System.out.println(num2 + "\t" + num1);
        } else {
            System.out.println(num1 + "\t" + num2);
        }

    }
}
