package ficha_extra_condicionais;

import java.util.Scanner;

public class ex2 {
    /*
        Solicite ao utilizador que insira o seu peso. Em seguida, calcule e exiba o peso que ele teria na Lua,
        considerando que o peso na Lua é aproximadamente 16% do peso na Terra. Use condicionais para verificar se o
        peso introduzido é maior que zero e, se for, faça o cálculo e exiba o resultado.
     */
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
