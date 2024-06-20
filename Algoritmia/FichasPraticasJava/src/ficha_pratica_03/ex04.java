package ficha_pratica_03;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS DE 0 ATÉ O VALOR ESCOLHIDO PELO USUÁRIO --");

        Scanner input = new Scanner(System.in);
        int i, numLim;

        System.out.print("Informe o número limite: ");
        numLim = input.nextInt();

        System.out.println("\n ------ \n");
        // Solução 1
        /*
        i = 0;
        while(i <= numLim){
            System.out.println(i);
            i++;
        }
        */

        // Solução 2
        i = 0;
        while(i <= numLim){
            System.out.println(i++);
        }

    }
}
