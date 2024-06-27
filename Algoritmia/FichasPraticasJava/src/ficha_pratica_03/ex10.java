package ficha_pratica_03;

import java.util.Scanner;

public class ex10 {
    /*
        Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        Suponha que o número lido da entrada será maior que 2.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("\n-- IMPRIME VALORES PARES ENTRE 2 E O NÚMERO INFORMADO  --");
        System.out.print("Informe um numero inteiro maior que 2: ");
        num = input.nextInt();

        System.out.println("\n ------ \n");
        for (int i = 2; i <= num; i+=2){
            System.out.println(i);
        }
    }

}
