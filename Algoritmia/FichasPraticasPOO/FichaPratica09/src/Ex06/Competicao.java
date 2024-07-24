package Ex06;

import Ex05.Pessoa;

public class Competicao {
    private String nome;
    private String pais;
    private Atleta[] atletas;
    private int contAtletas;

    /**
     * Método para construir Competição
     * @param nome
     * @param pais
     */
    public Competicao(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    /**
     * Adiciona uma pessoa à agenda
     * @param atleta Pessoa a ser adicionada
     */
    public void adicionarAtleta(Atleta atleta){

        if(contAtletas == 0){
            this.atletas = new Atleta[1];
            this.atletas[contAtletas] = atleta;
            contAtletas++;

        } else {
            Atleta[] novoArray = new Atleta[contAtletas + 1];
            for (int i = 0; i < atletas.length; i++){
                novoArray[i] = atletas[i];
            }

            novoArray[contAtletas] = atleta;
            contAtletas++;
            atletas = novoArray;
        }
    }

    /**
     * Imprime informações sobre a Competição
     */
    public void imprimirInformações(){
        System.out.println("\n ** DETALHES COMPETIÇÃO " + this.nome + " **");
        System.out.println("País: " + this.pais);
        if (contAtletas == 0){
            System.out.println("Ainda não há nenhum atleta inscrito na competição.");
        } else {
            System.out.println("\nAtletas participantes: ");
            for (int i = 0; i < this.contAtletas; i++){
                System.out.println("-- Atleta " + (i+1));
                this.atletas[i].imprimirPessoa();
            }
        }
        System.out.println(" ** Fim ** \n");
    }
}
