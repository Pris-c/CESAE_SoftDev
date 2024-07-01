package ficha_pratica_06;

import java.util.Scanner;

public class ex05e06 {
    /*
        O exercício deve ser resolvido na mesma classe (por exemplo: Ex_05), deve acrescentar as funções conforme
        solicitado. No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
        desenvolver nada no main), considere fazer o exercício 6 em concorrente para conseguir perceber se está
        tudo como esperado.
            a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.
            b) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.
            c) Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente.
        6. Implemente o programa “Análise de um Vetor” que pergunte um o tamanho do vetor que o utilizador deseja
        inserir. De seguida, permita ao utilizador preencher o vetor. Posteriormente apresente um menu de opções
        ao utilizador, que permitem analisar o vetor inserido. Esse menu de opções deve ter o seguinte aspeto:
            1. Maior Elemento
            2. Menor Elemento
            3. Crescente ou Não Crescent
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetor;
        int opcao;

        System.out.println(" ------- ANÁLISE DE UM VETOR ------- ");
        System.out.print("Informe o tamanho do vetor: ");
        vetor = new int[input.nextInt()];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Insira um numero no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        do {
            System.out.println("MENU" +
                    "\n1 - Maior elemento" +
                    "\n2 - Menor elemento" +
                    "\n3 - Crescente ou Não Cresente" +
                    "\n0 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            System.out.println("\n ------ \n");
            switch (opcao){

                case 1:
                    System.out.println("Maior valor = " + maiorValor(vetor));
                    break;
                case 2:
                    System.out.println("Menor valor = " + menorValor(vetor));
                    break;
                case 3:
                    if (vetorCrescente(vetor)){
                        System.out.println("Vetor crescente.");
                    } else {
                        System.out.println("Vetor não cresente.");
                    }
                    break;

            }
            System.out.println("\n ------ \n");

        } while (opcao != 0);

    }

    public static int maiorValor(int[] vetor){
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int menorValor(int[] vetor){
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static boolean vetorCrescente(int[] vetor){
        boolean cres = true;
        for (int i = 1; (i < vetor.length) && cres; i++) {
            if (vetor[i - 1] > vetor[i]) {
                cres = false;
            }
        }
        return cres;
    }

}
