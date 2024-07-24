package Ex06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String nacionalidade;

    /**
     * Método para construir Atleta
     * @param nome Nome do Atleta
     * @param modalidade Modalidade em que o Atleta compete
     * @param altura Altura do atleta em m
     * @param peso Peso do Atleta em kg
     * @param nacionalidade País de origem do Atleta
     */
    public Atleta(String nome, String modalidade, double altura, double peso, String nacionalidade) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
    }

    /**
     * Imprime informações sobre o Atleta
     */
    public void imprimirPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Modalidade: " + this.modalidade);
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Nacionalidade: " + this.nacionalidade);
    }

}
