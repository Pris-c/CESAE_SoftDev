package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {
    /*
        Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
        quantidade vendida, valor unitario) e calcule o valor total das vendas.
     */

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/ficha_pratica_07/ficheiros/exercicio_08.csv");
        System.out.println("Total de vendas = " + calcularTotalVendas(file));

    }

    /**
     * Calcula o valor total das vendas
     * @param ficheiro File ficheiro a ser analisado
     * @return double com o total das vendas
     * @throws FileNotFoundException
     */
    public static double calcularTotalVendas(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        double totalVendas = 0;
        double qtd, valor;

        scanner.nextLine();
        while (scanner.hasNext()) {
            String[] splitedLinha = scanner.nextLine().split(",");
            qtd = Double.parseDouble(splitedLinha[2]);
            valor = Double.parseDouble(splitedLinha[3]);
            totalVendas += (qtd * valor);
        }
        return totalVendas;
    }


}
