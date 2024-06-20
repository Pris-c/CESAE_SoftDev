package ficha_pratica_03;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, i;

        System.out.println("\n-- IMPRIME VALORES PARES ENTRE 2 E O NÚMERO INFORMADO  --");
        System.out.print("Informe um numero inteiro maior que 2: ");
        num = input.nextInt();

        System.out.println("\n ------ \n");

        i = 2;
        while(i <= num){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }


}
