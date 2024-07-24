package Ex03;

public class Animal {

    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;

    /**
     * Método para construir Animal
     * @param nome Nome próprio do Animal
     * @param especie Espécie do Animal
     * @param paisOrigem País de origem do Animal
     * @param peso Peso do Animal em kg
     * @param alimentacao Array de Strings contendo as opçõe de alimentos aceitos pelo Animal
     */
    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public double getPeso() {
        return peso;
    }

    public String[] getAlimentacao() {
        return alimentacao;
    }

    /**
     * Método para oferecer alimento ao animal
     * O alimento é aceito e incrementa o peso do animal
     *  caso conste no Array de String "alimentação"
     * @param alimento Alimento a ser oferecido
     * @param pesoRefeicao Peso da refeição oferecida em g
     */
    public void comer(String alimento, double pesoRefeicao){
        boolean sair = false;
        for (int i = 0; i < alimentacao.length && !sair; i++){
            if (alimento.equalsIgnoreCase(this.alimentacao[i])){
                this.peso += pesoRefeicao / 1000;
                sair = true;
            }
        }

        if (!sair){
            System.out.println("O animal recusou a comer " + alimento +".");
        }

    }
}
