package ficha_pratica_03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, fim;

        System.out.println("\n-- IMPRIME MULTIPLOS DE 5 NO INTERVALO DEFINIDO  --");
        System.out.print("Informe o valor inicial do intervalo: ");
        i = input.nextInt();
        System.out.print("Informe o valor inicial do intervalo: ");
        fim = input.nextInt();

        System.out.println("\n ------ \n");

        while (i % 5 != 0) {
            i++;
        }

        while(i <= fim){
            System.out.println(i);
            i+=5;
        }
    }
}
