package ficha_pratica_01;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h, min;
        int somaSeg = 0;

        System.out.println("\n-- CALCULA DURAÇÃO DO ALBUM --");

        System.out.print("Introduza minutos da música 1: ");
        somaSeg += (input.nextInt() * 60);
        System.out.print("Introduza segundos da música 1: ");
        somaSeg += (input.nextInt());

        System.out.print("Introduza minutos da música 2: ");
        somaSeg += (input.nextInt() * 60);
        System.out.print("Introduza segundos da música 2: ");
        somaSeg += (input.nextInt());

        System.out.print("Introduza minutos da música 3: ");
        somaSeg += (input.nextInt() * 60);
        System.out.print("Introduza segundos da música 3: ");
        somaSeg += (input.nextInt());

        System.out.print("Introduza minutos da música 4: ");
        somaSeg += (input.nextInt() * 60);
        System.out.print("Introduza segundos da música 4: ");
        somaSeg += (input.nextInt());

        System.out.print("Introduza minutos da música 5: ");
        somaSeg += (input.nextInt() * 60);
        System.out.print("Introduza segundos da música 5: ");
        somaSeg += (input.nextInt());

        h = somaSeg / (60*60);
        somaSeg = somaSeg % (60*60);

        min = somaSeg / 60;
        somaSeg = somaSeg % 60;

        System.out.println("\n ------ \n");
        System.out.println("Duração total do album: " + h + "h " + min + "min " + somaSeg + "s");

    }
}
