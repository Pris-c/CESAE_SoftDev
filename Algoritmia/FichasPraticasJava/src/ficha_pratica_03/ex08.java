package ficha_pratica_03;

import java.util.Scanner;

public class ex08 {
    /*
        Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
            a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20
     */
    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME OS 5 SUCESSORES E ANTECESSORES DO NÚMERO INFORMADO --");
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número inteiro: ");
        num = input.nextInt();

        System.out.println("\n ------ \n");
        for (int j = num - 5; j < num; j++){
            System.out.println(j);
        }
        System.out.println();
        for (int j = num + 1; j <= num + 5; j++){
            System.out.println(j);
        }


        /*
            //Solução com while
            int i;
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
        */
    }
}
