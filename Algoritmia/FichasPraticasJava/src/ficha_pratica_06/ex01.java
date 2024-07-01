package ficha_pratica_06;

import java.util.Scanner;

public class ex01 {
    /*
    Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento. De seguida, de
    acordo com o animal deve fazer o barulho característico (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub
    Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Escolha um animal: ");
        fazerBarulho(input.nextLine());

    }

    public static void fazerBarulho(String animal){
        String som = "";

        if (animal.equalsIgnoreCase("cao") || animal.equalsIgnoreCase("cão")){
            som = "Au au au";
        } else if (animal.equalsIgnoreCase("gato")){
            som = "Miau";
        } else if (animal.equalsIgnoreCase("peixe")){
            som = "Glub Glub";
        } else if (animal.equalsIgnoreCase("vaca")){
            som = "Muuuu";
        } else if (animal.equalsIgnoreCase("porco")){
            som = "Oinc oinc";
        }

        System.out.println(som);
    }


}
