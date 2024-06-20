package ficha_pratica_03;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME OS 5 SUCESSORES E ANTECESSORES DO NÚMERO INFORMADO --");
        Scanner input = new Scanner(System.in);
        int num, i;

        System.out.print("Informe um número inteiro: ");
        num = input.nextInt();

        System.out.println("\n ------ \n");

        i = num - 5;
        while(i < num){
            System.out.println(i);
            i++;
        }

        System.out.println();

        i++;
        num = num + 5;
        while(i <= num){
            System.out.println(i);
            i++;
        }
    }
}
