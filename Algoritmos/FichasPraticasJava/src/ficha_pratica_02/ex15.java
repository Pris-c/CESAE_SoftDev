package ficha_pratica_02;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        int maior, med, menor;
        String ord;

        System.out.println("\n-- EXIBE VALORES EM ORDENADOS --");
        System.out.print("Informe o valor 1: ");
        num1 = input.nextInt();
        System.out.print("Informe o valor 2: ");
        num2 = input.nextInt();
        System.out.print("Informe o valor 3: ");
        num3 = input.nextInt();
        System.out.println("Em qual ordem deseja exibir os valores:");
        System.out.println("C - Crescente");
        System.out.println("D - Decrescente");
        ord = input.next();

        if (!(ord.equals("C") || ord.equals("D") || ord.equals("c") || ord.equals("d"))){
            System.out.println("Opção inválida. Tente novamente!");
        }
        else {
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

            if (ord.equals("D") || ord.equals("d")){
                int aux = menor;
                menor = maior;
                maior = aux;
            }

            System.out.println("\n ------ \n");
            System.out.println(menor + "\t" + med + "\t" + maior);
        }
    }
}
