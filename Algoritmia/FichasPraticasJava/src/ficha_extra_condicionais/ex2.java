package ficha_extra_condicionais;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pesoTerra, pesoLua;

        System.out.println("\n-- SEU PESO NA LUA  --");
        System.out.print("Introduza o peso em Kg: ");
        pesoTerra = input.nextDouble();
        System.out.println("------");


        if (pesoTerra > 0){
            pesoLua = pesoTerra * 0.16;
            System.out.println("Peso na lua: " + pesoLua + " Kg.");
        }

    }
}
