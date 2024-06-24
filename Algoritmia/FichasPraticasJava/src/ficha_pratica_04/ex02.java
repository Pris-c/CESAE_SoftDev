package ficha_pratica_04;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String op;
        boolean sair;

         String menu = "-- MENU -- " +
                 "\n 1. Criar" +
                 "\n 2. Atualizar" +
                 "\n 3. Eliminar" +
                 "\n 4. Sair" +
                 "\n >> ";

         op = "x";
         sair = false;

         while(!sair){
             System.out.print(menu);
             op = input.next();

             System.out.println("\n ------ \n");
             switch (op){
                 case "1":
                     System.out.println("CRIAR");
                     break;
                 case "2":
                     System.out.println("ATUALIZAR");
                     break;
                 case "3":
                     System.out.println("ELIMINAR");
                     break;
                 case "4":
                     System.out.println("SAIR");
                     sair = true;
                     break;
                 default:
                     System.out.println("Opção inválida!");
             }
             System.out.println("\n ------ \n");

         }

    }

}
