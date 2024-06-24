package ficha_extra_condicionais;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ano;
        boolean bissexto = true;

        System.out.println("\n-- ANO BISSEXTO?  --");
        /*
        Ano bissexto:
            - divisível por 4
            - não divisível por 100
            - divisível por 400
         */
        System.out.print("Insira o ano: ");
        ano = input.nextInt();

        System.out.println("------");

        if (ano % 4 == 0){
            if (ano % 100 == 0){
               if (!(ano % 400 == 0)){
                   bissexto = false;
               }
            } // else: é bissexto.

        } else {
            bissexto = false;
        }

        if (bissexto){
            System.out.println("É bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }


    }
}
