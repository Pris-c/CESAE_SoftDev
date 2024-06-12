package ficha_pratica_02;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor;
        menor = 0;

        System.out.println("\n-- EXIBE MAIOR INTEIRO INFORMADO PELO USUÁRIO --");
        System.out.print("Informe o primeiro numero inteiro: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo numero inteiro: ");
        num2 = input.nextInt();
        System.out.print("Informe o terceiro numero inteiro: ");
        num3 = input.nextInt();

        System.out.println("\n ------ \n");

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números informados são iguais.");
        }
        else {
            if (num1 < num2 && num1 < num3) {
                menor = num1;
            } else if (num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }
            System.out.println("Menor: " + menor);
        }


    }
}
