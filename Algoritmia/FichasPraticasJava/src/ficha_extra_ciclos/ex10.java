package ficha_extra_ciclos;

import java.util.Scanner;

public class ex10 {
    /*
        Escreva um programa que solicite um número inteiro ao utilizador, de seguida imprima o número com os digitos revertidos.
        Ex.: Numero 22456 | 65422
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, resto, rev;

        System.out.println("\n-- SOMA DOS DIGITOS  --");
        System.out.print("Informe um numero inteiro: ");
        n = input.nextInt();

        rev = 0;
        while(n > 10){
            resto = (n % 10);
            rev = (resto + rev) * 10;
            n = n / 10;
        }
        rev = rev + n;

        System.out.println("\n ------ \n");
        System.out.println("Reverso: " + rev);
    }

}
