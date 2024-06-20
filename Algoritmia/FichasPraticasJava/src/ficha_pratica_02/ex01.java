package ficha_pratica_02;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("\n-- EXIBE MAIOR VALOR ENTRE DOIS INTEIROS --");
        System.out.print("Informe o primeiro valor inteiro: ");
        num1 = input.nextInt();
        System.out.print("Informe o segundo valor inteiro: ");
        num2 = input.nextInt();

        System.out.println("\n ------ \n");
        
        if (num1 > num2){
            System.out.println("Maior: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maior: " + num2);
        } else {
            System.out.println("Os números informados são iguais.");
        }

    }
}
