package ficha_pratica_03;

public class ex03 {

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME NÚMEROS IMPARES ENTRE 531 A 750 (INCLUSIVE) --");

        // Solução 1
        /*int x = 531;

        while (x <= 750) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
        */

        // Solução 2
        int x = 531;
        while(x < 750){
            System.out.println(x);
            x+=2;
        }

    }
}
