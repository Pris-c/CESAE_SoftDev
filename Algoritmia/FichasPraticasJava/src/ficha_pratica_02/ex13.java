package ficha_pratica_02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hora, min;

        System.out.println("\n-- CONVERSOR HORÁRIO --");
        System.out.print("Introduza horas: ");
        hora = input.nextInt();
        System.out.print("Introduza minutos: ");
        min = input.nextInt();

        System.out.println("\n ------ \n");
        if (hora > 12){
            hora = hora - 12;
            System.out.println(hora + ":" + min + " PM");
        } else {
            System.out.println(hora + ":" + min + " AM");
        }



    }
}
