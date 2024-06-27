package ficha_extra_condicionais;

import java.util.Scanner;

public class ex6 {
    /*
        Crie um programa que solicite um ano e verifique se ele é bissexto (Tem 366 dias e acontece de 4 e 4 anos).
        a.Exemplo: Insira o ano: 2012 -> É bissexto
        b.Exemplo: Insira o ano: 2013 -> Não é bissexto
        c.Exemplo: Insira o ano: 2023 -> Não é bissexto
        d.Exemplo: Insira o ano: 2024 -> É bissexto
     */
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
