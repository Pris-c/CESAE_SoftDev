package Ex05;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;
    private String telemovel;

    /**
     * Método para construir Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa em anos
     * @param email E-mail pessoal
     * @param telemovel Número de telemóvel para contacto
     */
    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    /**
     * Imprime informações sobre a Pessoa
     */
    public void imprimirPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Email: " + this.email);
        System.out.println("Telemóvel: " + this.telemovel);
    }
}
