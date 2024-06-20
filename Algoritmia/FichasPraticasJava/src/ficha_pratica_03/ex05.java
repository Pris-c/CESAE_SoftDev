package ficha_pratica_03;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        System.out.println("\n-- IMPRIME A MENSAGEM INFORMADA NA QUANTIDADE ESCOLHIDA --");

        Scanner input = new Scanner(System.in);
        int x, numRepet;
        String msg;

        System.out.print("Informe o número de repetições: ");
        numRepet = input.nextInt();
        input.nextLine(); //Limpeza de buffer

        System.out.println("Digite a mensagem a ser impressa: ");
        System.out.print(">> ");
        msg = input.nextLine();

        System.out.println("\n ------ \n");

        x = 0;
        while(x < numRepet){
            System.out.println(msg);
            x++;
        }

    }
}
