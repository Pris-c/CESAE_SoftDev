package ficha_pratica_02;

import java.util.Scanner;

public class ex12 {
    /*
       Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
        1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada.
        Caso a opção for inválida, deve informar o utilizador.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("\n-- MENU --");
        System.out.println("Escolha a opção desejada:");
        System.out.println("1. CRIAR");
        System.out.println("2. ATUALIZAR");
        System.out.println("3. ELIMINAR");
        System.out.println("4. SAIR");
        System.out.print(">> ");

        opcao = input.nextInt();

        System.out.println("\n ------ \n");
        switch (opcao){
            case 1:
                System.out.println("1. CRIAR");
                break;
            case 2:
                System.out.println("2. ATUALIZAR");
                break;
            case 3:
                System.out.println("3. ELIMINAR");
                break;
            case 4:
                break;
            default:
                System.out.println("Oção inválida");
        }


    }
}
