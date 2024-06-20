package ficha_pratica_03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, lim, incr;

        System.out.println("\n-- IMPRIME VALORES ENTRE 0 E LIMITE, COM SALTO INFORMADO PELO USUÁRIO  --");

        System.out.print("Introduza o valor limite: ");
        lim = input.nextInt();

        System.out.print("Introduza o valor do salto: ");
        incr = input.nextInt();

        System.out.println("\n ------ \n");

        x = 0;
        while (x <= lim){
            System.out.println(x);
            x+=incr;
        }


    }
}
