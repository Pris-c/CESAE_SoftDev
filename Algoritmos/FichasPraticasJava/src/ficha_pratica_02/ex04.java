package ficha_pratica_02;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int posicao, pontos;

        System.out.println("\n-- INFORMA PONTOS DO CORREDOR --");
        System.out.print("Introduza o seu lugar na corrida: ");
        posicao = input.nextInt();

        System.out.println("\n ------ \n");

        if (posicao < 1){
            System.out.println("Posição inválida.");
        } else if (posicao > 8) {
            System.out.println("Não ganhou pontos.");
        } else {

            switch (posicao){
                case 1: pontos = 10; break;
                case 2: pontos = 8; break;
                case 3: pontos = 6; break;
                case 4: pontos = 5; break;
                case 5: pontos = 4; break;
                case 6: pontos = 3; break;
                case 7: pontos = 2; break;
                case 8: pontos = 1; break;
                default: pontos = 0;
            }
            System.out.println("Ganhou " + pontos + " pontos!");
        }
    }
}
