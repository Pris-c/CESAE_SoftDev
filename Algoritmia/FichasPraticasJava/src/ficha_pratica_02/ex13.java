package ficha_pratica_02;

import java.util.Scanner;

public class ex13 {
    /*
        Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
        Exemplo:
        Valores Lidos: 22 32 Resultado: 10 32 PM
        Valores Lidos: 10 44 Resultado: 10 44 AM
     */

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
