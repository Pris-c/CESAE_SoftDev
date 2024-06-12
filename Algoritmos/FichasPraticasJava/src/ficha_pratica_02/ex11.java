package ficha_pratica_02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo, montante, result;

        System.out.println("\n-- ATM --");
        System.out.print("Informe o saldo: ");
        saldo = input.nextDouble();

        System.out.print("Informe o montante a debitar/creditar: ");
        montante = input.nextInt();

        result = saldo + montante;

        System.out.println("\n ------ \n");

        if(result >= 0){
            saldo = result;
        } else {
            System.out.println("Operação Inválida!");
        }
        System.out.println("Saldo Atual: " + saldo);

    }
}
