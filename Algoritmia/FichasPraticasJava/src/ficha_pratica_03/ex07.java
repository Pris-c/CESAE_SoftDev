package ficha_pratica_03;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS DE 1 A 100 E O SOMATÓRIO DOS VALORES --");
        int x, sum;

        x = 1;
        sum = 0;

        while (x <= 100){
            System.out.println(x);
            sum = sum + x;
            x++;
        }

        System.out.println("\nSomatório = " + sum);

    }
}
