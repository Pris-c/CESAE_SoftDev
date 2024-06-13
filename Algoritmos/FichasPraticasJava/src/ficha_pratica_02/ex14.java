package ficha_pratica_02;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int maior, med, menor;

        System.out.println("\n-- EXIBE VALORES EM ORDEM CRESCENTE --");
        System.out.print("Informe o valor 1: ");
        num1 = input.nextInt();
        System.out.print("Informe o valor 2: ");
        num2 = input.nextInt();
        System.out.print("Informe o valor 3: ");
        num3 = input.nextInt();

        //1, 1, 1
        if (num1 == num2 && num2 == num3) {
            maior = med = menor = num1;
        }
        // 1, 2, 3
        // 1, 3, 2
        // 1, 2, 2
        else if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 >= num3) {
                med = num2;
                menor = num3;
            } else {
                med = num3;
                menor = num2;
            }
        }
        // 2, 1, 3
        // 2, 3, 1
        // 2, 1, 1
        else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 >= num3) {
                med = num1;
                menor = num3;
            } else {
                med = num3;
                menor = num1;
            }
        }

        // 3, 1, 2
        // 3, 2, 1
        // 3, 1, 1
        else {
            maior = num3;
            if (num1 >= num2) {
                med = num1;
                menor = num2;
            } else {
                med = num2;
                menor = num1;
            }
        }
        System.out.println("\n ------ \n");
        System.out.println(menor + "\t" + med + "\t" + maior);

    }
}
