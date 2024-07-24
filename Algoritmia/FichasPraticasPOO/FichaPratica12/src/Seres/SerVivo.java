package Seres;

public class SerVivo {
    protected String nome;
    protected String especie;
    protected String pais;
    protected int idade;

    /**
     * Método para construir SerVivo
     * @param nome Nome do SerVivo
     * @param especie Espécie do SerVivo
     * @param pais País de Origem
     * @param idade Idade em anos
     */
    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    /**
     * Exibe todas as informações sobre o SerVivo
     */
    public void exibirInformacoes(){
        System.out.println("** Nome: " + this.nome + " | Espécie: " + this.especie + " | Psís: " + this.pais + " | Idade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }
}
