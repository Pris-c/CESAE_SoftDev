package ficha_extra_ciclos;

import java.util.Scanner;

public class ex09 {
    /*
        Escreva um programa que calcule a soma dos dígitos de um número inteiro. (Ex.: 112 1+1+2=4).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, soma;

        System.out.println("\n-- SOMA DOS DIGITOS  --");
        System.out.print("Informe um numero inteiro: ");
        n = input.nextInt();

        soma = 0;
        while(n > 10){
            soma += (n % 10);
            n = n / 10;
        }
        soma += n;

        System.out.println("\n ------ \n");
        System.out.println("SOMA: " + soma);
    }

}
