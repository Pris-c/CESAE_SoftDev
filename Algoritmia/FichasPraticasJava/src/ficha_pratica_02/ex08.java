package ficha_pratica_02;

import java.util.Scanner;

public class ex08 {
    /*
        Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
        se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String msgErro = "Nota inválida! Inicie o programa novamente.";
        double nota1, nota2, nota3,medPond;

        final double pond1 = 0.25;
        final double pond2 = 0.35;
        final double pond3 = 0.40;
        final double NOTA_MIN_APROV = 9.5;

        System.out.println("\n-- INFORMA SE O ALUNO ESTÁ OU NÃO APROVADO --");

        System.out.print("Informe a nota 1: ");
        nota1 = input.nextDouble();
        if (nota1 < 0 || nota1 > 20){
            System.out.println(msgErro);
        } else {

            System.out.print("Informe nota 2: ");
            nota2 = input.nextDouble();

            if (nota2 < 0 || nota2 > 20){
                System.out.println(msgErro);

            } else {
                System.out.print("Informe nota 3: ");
                nota3 = input.nextDouble();

                if (nota3 < 0 || nota3 > 20){
                    System.out.println(msgErro);

                } else {

                    medPond = ((nota1 * pond1) + (nota2 * pond2) + (nota3 * pond3)) / (pond1 + pond2 + pond3);

                    System.out.println("\n ------ \n");
                    if (medPond >= NOTA_MIN_APROV){
                        System.out.println("ESTUDANTE APROVADO COM MÉDIA " + medPond);
                    } else {
                        System.out.println("ESTUDANTE REPROVADO COM MÉDIA " + medPond);
                    }

                }
            }
        }
    }
}
