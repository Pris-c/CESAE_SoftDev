package ficha_pratica_06;

import java.util.Scanner;

public class ex03e04 {
    /*
        3.
        O exercício deve ser resolvido na mesma classe (por exemplo: Ex_03), deve acrescentar as funções conforme
        solicitado. No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
        desenvolver nada no main), considere fazer o exercício 4 em concorrente para conseguir perceber se está tudo
        como esperado.
            a) Implemente uma função que determina se um número (passado por argumento) é par ou ímpar, a função
            deve retornar true se par ou false se ímpar
            b) Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
            a função deve retornar true se zero ou positivo, ou false se negativo.
            c) Implemente uma função que determina se um número (passado por argumento) é ou não primo, a função
            deve retornar true se primo ou false se não primo.
            d) Implemente uma função que determina se um número (passado por argumento) é perfeito, a função deve
            retornar true se perfeito ou false se não perfeito (Os números perfeitos são iguais à soma dos seus
            divisores: 6 pode ser dividido por 1, 2 e 3 e, quando soma esses números, o resultado é 6).
            e) Implemente uma função que determina se um número (passado por argumento) é triangular, a função
            deve retornar true se triangular ou false se não triangular (Um número triangular é um número que pode
            ser representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5).
        4.
        Implemente o programa “Análise de um Número” que pergunte um número ao utilizador e, de seguida,
        apresente um menu de opções ao utilizador, que permitem analisar o número inserido. Esse menu de opções
        deve ter o seguinte aspeto:
            1. Par ou Ímpar
            2. Positivo ou Negativo
            3. Primo ou Não Primo
            4. Perfeito ou Não Perfeito
            5. Triangular ou Não Triangular
            6. Trocar de Número
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println(" ------- ANÁLISE DE UM NÚMERO ------- ");
        System.out.print("Informe um numero inteiro: ");
        n = input.nextInt();
        int opcao;


        do {
            System.out.println("\n ---- Analisando número " + n + " ----");
            System.out.println(
                    "1 - Par ou Impar" +
                    "\n2 - Positivo ou Negativo" +
                    "\n3 - Primo ou Não Primo" +
                    "\n4 - Perfeiro ou Não Perfeito" +
                    "\n5 - Triangular ou Não Triangular" +
                    "\n6 - Trocar de Número" +
                    "\n0 - SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            //System.out.println("\n ------ \n");
            System.out.println();
            switch (opcao){

                case 1:
                    if (par(n)){
                        System.out.println(n + " é par.");
                    } else {
                        System.out.println(n + " é impar.");
                    }
                    break;

                case 2:
                    if (positivo(n)){
                        System.out.println(n + " positivo.");
                    } else {
                        System.out.println(n + " é negativo.");
                    }
                    break;

                case 3:
                    if (primo(n)){
                        System.out.println(n + " é primo.");
                    } else {
                        System.out.println(n + " não é primo.");
                    }
                    break;

                case 4:
                    if (perfeito(n)){
                        System.out.println(n + " é perfeito.");
                    } else {
                        System.out.println(n + " não é perfeito.");
                    }
                    break;

                case 5:
                    if (numeroTriangular(n)){
                        System.out.println(n + " é triangular.");
                    } else {
                        System.out.println(n + " não é triangular.");
                    }
                    break;

                case 6:
                    System.out.println("Informe um numero inteiro: ");
                    n = input.nextInt();
                    break;
                default:
                    System.out.println("Opção inválida.");

            }
            //System.out.println("\n ------ \n");
            System.out.println();

        } while (opcao != 0);

    }

    /**
     * Retorna se número é par ou impar
     * @param num  Número inteiro
     * @return true se par  || false se impar
     */
    public static boolean par(int num){
        return num % 2 == 0;
    }

    /**
     * Retorna se número é positivo ou negativo
     * @param num Número inteiro
     * @return true se positivo ou zero || false se negativo
     */
    public static boolean positivo(int num){
        return num >= 0;
    }
    public static boolean primo(int num){
        if (num < 2){
            return false;
        }

        for (int i = 2; i < num; i++){
            if (num % 2 == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean perfeito(int num){
        boolean perfeito = true;
        int soma = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                soma += i;
            }
        }

        return num == soma;
    }

    public static boolean numeroTriangular(int num){
        int i = 1;
        int soma = 0;

        while (soma < num){
                soma += i;
                i++;
        }

        return soma == num;
    }


}
