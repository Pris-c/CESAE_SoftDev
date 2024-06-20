package ficha_pratica_03;

public class ex02 {

    public static void main(String[] args) {

        // Soluçao 1
        /*System.out.println("\n-- IMPRIME NÚMEROS PARES ENTRE 1 A 400 (INCLUSIVE) --");
        int x = 1;
        while (x <= 400){
            if(x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }
        */

        // Solução 2
        System.out.println("\n-- IMPRIME NÚMEROS PARES ENTRE 1 A 400 (INCLUSIVE) --");
        int x = 2;
        while (x <= 400){
            System.out.println(x);
            x+=2;
        }
    }

}
