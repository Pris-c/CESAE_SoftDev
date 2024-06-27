package ficha_pratica_03;

public class ex02 {

    public static void main(String[] args) {

        /*
            Faça um programa que imprima os números pares no intervalo de 1 a 400 inclusive.
            (Não necessita de Scanner ou input do utilizador)
         */

        /*
            //Soluçao 1
            System.out.println("\n-- IMPRIME NÚMEROS PARES ENTRE 1 A 400 (INCLUSIVE) --");
            for (int i = 1; i <= 400; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
         */

        // Solução 2
        System.out.println("\n-- IMPRIME NÚMEROS PARES ENTRE 1 A 400 (INCLUSIVE) --");
        for (int i = 2; i <= 400; i+=2){
            System.out.println(i);
        }

    }
}
