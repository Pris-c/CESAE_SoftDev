package ficha_extra_condicionais;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double preco, valorFinal;

        System.out.println("\n-- AVALIA DESCONTO EM PREÇO  --");
        System.out.print("Introduza o preço: ");
        preco = input.nextDouble();
        System.out.println("------");

        if(preco > 100){
            valorFinal = preco * 0.9;
            System.out.println("Preço final: "  + valorFinal + " (10% de desconto)");
        } else {
            System.out.println("Preço final: "  + preco + " (nenhum desconto aplicado)");
        }



    }
}
