package ficha_pratica_02;

import java.util.Scanner;

public class ex12 {
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
