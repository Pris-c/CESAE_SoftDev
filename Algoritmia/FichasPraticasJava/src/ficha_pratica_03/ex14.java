package ficha_pratica_03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, n1, i, lim;
        boolean cres;

        System.out.println("\n-- INFORMA SE NUMEROS ESTÃO EM ORDEM CRESCENTE  --");

        System.out.print("Quantos números deseja inserir: ");
        lim = input.nextInt();

        System.out.print("Introduza um número: ");
        n1 = input.nextInt();

        i = 1;
        cres = true;

        while (i < lim){
            n = n1;

            System.out.print("Introduza um número: ");
            n1 = input.nextInt();

            if(cres && (n > n1)){
                cres = false;
            }
            i++;
        }

        System.out.println("\n ------ \n");

        if (cres){
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }

    }
}
