package ficha_extra_condicionais;

import java.util.Scanner;

public class ex4 {
    /*
        Crie um programa que solicite uma letra do alfabeto e verifique se é uma vogal ou uma consoante. Considere
        apenas letras minúsculas
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String letra;

        System.out.println("\n-- VOGAL OU CONSOANTE  --");
        System.out.print("Digite uma letra minuscula: ");
        letra = input.next();
        System.out.println("------");

        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("VOGAL");
        } else {
            System.out.println("CONSOANTE");
        }

    }
}
