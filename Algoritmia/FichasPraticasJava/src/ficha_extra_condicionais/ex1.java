package ficha_extra_condicionais;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade;
        String saida;

        System.out.println("\n-- VERIFICA SE PESSOA É MAIOR DE IDADE  --");
        System.out.print("Introduza a idade: ");
        idade = input.nextInt();

        System.out.println("------");
        saida = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(saida);


    }
}
