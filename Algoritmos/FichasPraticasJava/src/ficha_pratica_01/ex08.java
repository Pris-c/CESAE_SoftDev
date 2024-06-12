package ficha_pratica_01;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int duracao, h, min, seg;
        int somaSeg = 0;

        System.out.println("\n-- CALCULA DURAÇÃO DO ALBUM --");

        System.out.print("Introduza minutos da música 1: ");
        duracao = input.nextInt();
        somaSeg += (duracao * 60);
        System.out.print("Introduza segundos da música 1: ");
        duracao = input.nextInt();
        somaSeg += (duracao);

        System.out.print("Introduza minutos da música 2: ");
        duracao = input.nextInt();
        somaSeg += (duracao * 60);
        System.out.print("Introduza segundos da música 2: ");
        duracao = input.nextInt();
        somaSeg += (duracao);

        System.out.print("Introduza minutos da música 3: ");
        duracao = input.nextInt();
        somaSeg += (duracao * 60);
        System.out.print("Introduza segundos da música 3: ");
        duracao = input.nextInt();
        somaSeg += (duracao);

        System.out.print("Introduza minutos da música 4: ");
        duracao = input.nextInt();
        somaSeg += (duracao * 60);
        System.out.print("Introduza segundos da música 4: ");
        duracao = input.nextInt();
        somaSeg += (duracao);

        System.out.print("Introduza minutos da música 5: ");
        duracao = input.nextInt();
        somaSeg += (duracao * 60);
        System.out.print("Introduza segundos da música 5: ");
        duracao = input.nextInt();
        somaSeg += (duracao);


        h = somaSeg / (60*60);
        somaSeg = somaSeg % (60*60);

        min = somaSeg / 60;
        somaSeg = somaSeg % 60;

        System.out.println("\n ------ \n");
        System.out.println("Duração total do album: " + h + "h " + min + "min " + somaSeg + "s");

    }
}
