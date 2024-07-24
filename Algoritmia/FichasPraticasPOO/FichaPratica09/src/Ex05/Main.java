package Ex05;

public class Main {
    public static void main(String[] args) {



        Pessoa pessoa1 = new Pessoa("Pessoa 1", 15, "pessoa1@email.com", "999888777");
        Pessoa pessoa2 = new Pessoa("Pessoa 2", 30, "pessoa2@outroemail.com", "888777666");
        Pessoa pessoa3 = new Pessoa("Pessoa 3", 45, "pessoa3@email.com", "777666555");

        Agenda minhaAgenda = new Agenda();

        minhaAgenda.imprimirAgenda();
        minhaAgenda.adicionarPessoa(pessoa1);
        minhaAgenda.imprimirAgenda();
        minhaAgenda.adicionarPessoa(pessoa2);
        minhaAgenda.imprimirAgenda();
        minhaAgenda.adicionarPessoa(pessoa3);
        minhaAgenda.imprimirAgenda();

    }
}
