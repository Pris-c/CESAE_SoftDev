package ficha_extra_condicionais;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final int N_SECRETO = 15;
        int n;

        System.out.println("\n-- NUMERO SECRETO --");
        // Primeira tentativa
        System.out.println("Adivinhe o número secreo (Entre 1 e 100)");
        System.out.print(">> ");
        n = input.nextInt();
        System.out.println("------");

        if (n == N_SECRETO){
            System.out.println("Boa! Ganhaste o jogo!");
        } else {
            if (n < 0 || n > 100) {
                System.out.println("Fora do intervalo válido!");
            } else if (n < N_SECRETO) {
                System.out.println("Muito baixo.");
            } else {
                System.out.println("Muito alto.");
            }

            System.out.println("Adivinhe o número secreo (Entre 1 e 100)");
            System.out.print(">> ");
            n = input.nextInt();

            System.out.println("------");
            if (n == N_SECRETO) {
                System.out.println("Boa! Ganhaste o jogo!");
            } else {
                if (n < 0 || n > 100) {
                    System.out.println("Fora do intervalo válido!");
                } else if (n < N_SECRETO) {
                    System.out.println("Muito baixo.");
                } else  {
                    System.out.println("Muito alto.");
                }
                System.out.println("Ficaste sem tentativas..");
            }
        }
    }
}
