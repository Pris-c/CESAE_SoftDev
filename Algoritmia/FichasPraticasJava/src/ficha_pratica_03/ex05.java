package ficha_pratica_03;

import java.util.Scanner;

public class ex05 {
    /*
        Faça um programa que leia um número inteiro e, de seguida, leia uma mensagem.
        Depois imprima a mensagem x vezes, sendo x o número inteiro lido
     */

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME A MENSAGEM INFORMADA NA QUANTIDADE ESCOLHIDA --");
        Scanner input = new Scanner(System.in);
        int numRepet;
        String msg;

        System.out.print("Informe o número de repetições: ");
        numRepet = input.nextInt();
        input.nextLine(); //Limpeza de buffer

        System.out.println("Digite a mensagem a ser impressa: ");
        System.out.print(">> ");
        msg = input.nextLine();

        System.out.println("\n ------ \n");
        for (int i = 0; i < numRepet; i++){
            System.out.println(msg);
        }

    }
}
