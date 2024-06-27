package ficha_pratica_02;

import java.util.Scanner;

public class ex04 {
    /*
    Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
        a.1º Lugar: 10 pontos
        b.2º Lugar: 8 pontos
        c.3º Lugar: 6 pontos
        d.4º Lugar: 5 pontos
        e.5º Lugar: 4 pontos
        f.6º Lugar: 3 pontos
        g.7º Lugar: 2 pontos
        h.8º Lugar: 1 ponto
       Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.
     */

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
