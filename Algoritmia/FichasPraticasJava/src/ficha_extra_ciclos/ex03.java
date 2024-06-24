package ficha_extra_ciclos;

public class ex03 {
    /*
        Escreva um programa que exiba a tabuada de multiplicação de todos os números de 1 a 10.
     */
    public static void main(String[] args) {
        System.out.println("\n-- TABUADAS --");

        for (int i = 1; i <= 10; i++){
            System.out.println("Tabuada do " + i + ": ");
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
