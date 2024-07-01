package ficha_pratica_06;

import java.util.Scanner;

public class ex02 {
    /*
        Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) e
        crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador
     */


    public static void main(String[] args) {
        imprimir(lerInteiroPositivo());
    }

    public static int lerInteiroPositivo(){
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduza um número inteiro positivo: ");
            n = input.nextInt();

        } while (n<=0);
        return n;
    }

    public static void imprimir(int repeticoes){
        for (int i = 0; i < repeticoes; i++){
            System.out.print("*");
        }
    }
}
