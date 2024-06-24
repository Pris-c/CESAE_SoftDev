package ficha_extra_ciclos;

public class ex05 {
    /*
        Escreva 3 programas que exibam os seguintes padrões (5.1, 5.2, 5.3)
     */

    public static void main(String[] args) {

        System.out.println("\n-- PADRÃO 5.1 --");
        for (int i = 1; i <= 4; i++){

            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("\n-- PADRÃO 5.2 --");
        // j = numero a ser impresso
        // espacos = 9 - i
        int espaco = 0;
        for (int i = 1, j = 1; i <= 9; i+=2, j++){
            espaco = (9 - i) / 2;

            for (int l = 0; l < espaco; l++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print(j);
            }
            for (int l = 0; l < espaco; l++){
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("\n-- PADRÃO 5.3 --");
        // i = linha | contador
        for (int i = 1; i <= 5; i++){
            espaco = 9 - i;

            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }

            int k = i;
            while (k > 1){
                System.out.print(k);
                k--;
            }
            while (k <= i){
                System.out.print(k);
                k++;
            }
            for (int j = 0; j < espaco; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
