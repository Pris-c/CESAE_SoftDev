package ficha_pratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {
    /*
        Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
        duração) para uma matriz.
        a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
        b. Pesquisar por músicas de um determinado género.
        c. Pesquisar músicas de um determinado artista.
        d. Pesquisar música com maior duração.
        e. Pesquisar músicas com duração acima de um valor especificado.
        f. Número de músicas no ficheiro
     */

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matriz = extrairFicheiroParaMatriz(new File("src/ficha_pratica_07/ficheiros/exercicio_09.csv"));
        Scanner scan = new Scanner(System.in);
        int op = -1;

        do{
            try{
                System.out.println(" ---- MEU ALBUM -----");
                System.out.println("1 - Pesquisar por gênero");
                System.out.println("2 - Pesquisar por artista");
                System.out.println("3 - Encontrar musica com maior duração");
                System.out.println("4 - Encontrar musica com duração acima da especificada");
                System.out.println("5 - Contar musicas no ficheiro");
                System.out.println("0 - SAIR");
                System.out.print(">> ");
                op = scan.nextInt();

                switch (op) {
                    case 1:
                        findByGenre(matriz);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente!");
                        break;
                }

            } catch (Exception e){
                System.out.println(" -- Opção inválida. Tente novamente! -- \n");
                scan.nextLine();
                op = -1;
            }

        } while (op != 0);

    }


    public static int contarLinhas(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        int contLinhas = 0;
        while(scanner.hasNext()){
            contLinhas++;
            scanner.nextLine();
        }
        return contLinhas;
    }

    public static String[][] extrairFicheiroParaMatriz(File ficheiro) throws FileNotFoundException {
        Scanner scanner = new Scanner(ficheiro);
        String[][] matrizFicheiro;
        int linhas = contarLinhas(ficheiro);
        int colunas = scanner.nextLine().split(",").length;
        matrizFicheiro = new String[linhas][colunas];

        int contLinha = 0;
        while(scanner.hasNext()){
            String[] arrayLinha = scanner.nextLine().split(",");

            for (int i = 0 ; i < colunas; i++){
                matrizFicheiro[contLinha][i] = arrayLinha[i];
            }
            contLinha++;
        }

        return matrizFicheiro;

    }

    // Pesquisar por músicas de um determinado género = coluna[2]
    public static void findByGenre(String[][] matrizFicheiro){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual genero quer pesquisar: ");
        System.out.print(">> ");
        String genre = scanner.nextLine();

        System.out.println("\n --------- " + genre.toUpperCase() + " ---------");
        for (int i = 0; i < matrizFicheiro.length; i++) {
            for (int j = 0; j < matrizFicheiro[0].length; j++) {
                if (genre.equalsIgnoreCase(matrizFicheiro[i][j])) {
                    for (int k = 0; k < matrizFicheiro[0].length; k++) {
                        System.out.print(matrizFicheiro[i][k] + "\t-\t");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("\n\n");
    }

    /*
    public static String findByArtist(String name){}
    public static int maiorDuracao(String name){}
    public static int duracaoMaiorQue(String name){}
    public static int contMusic(String name){}*/

}
