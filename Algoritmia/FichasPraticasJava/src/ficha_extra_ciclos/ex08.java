package ficha_extra_ciclos;

import java.util.Scanner;

public class ex08 {
    /*
        Escreva um programa que solicite ao utilizador dois números, se seguida calcule o resultado de elevar o primeiro
        ao segundo. (Ex.: Primeiro Número: 5 | Segundo Número: 3 | Resultado (5 elevado a 3): 125).
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int base, pot, total;
        total = 1;

        System.out.println("\n-- CALCULA POTÊNCIA  --");
        System.out.print("Base: ");
        base = input.nextInt();
        System.out.print("Potência: ");
        pot = input.nextInt();

        System.out.println("\n ------ \n");
        for (int i = 0; i < pot; i++){
            total *= base;
        }
        System.out.println(base + "^" + pot + " = " + total);
    }

}
