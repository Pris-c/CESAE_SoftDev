package Ex02;

public class Pessoa {

    private String nome;
    private int idade;
    private String telemovel;
    private String email;

    /**
     * Método para construir Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa em anos
     * @param telemovel Número de telemóvel para contacto
     * @param email Endereço de e-mail para contacto
     */
    public Pessoa(String nome, int idade, String telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Exibe todos os detalhes sobre uma Pessoa
     */
    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " | Telemóvel: " + this.telemovel + " | E-mail: " + this.email);
    }
}
