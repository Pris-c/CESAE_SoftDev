package Ex02;

public class Main {
    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Priscila", 29, "954 584 877", "priscila@email.com");
        Pessoa pessoa2 = new Pessoa("Vitor", 24, "922 555 847", "vitor@email.com");
        Pessoa pessoa3 = new Pessoa("Ana", 17, "911 485 968", "ana@email.com");
        Pessoa pessoa4 = new Pessoa("Joaquim", 13, "954 246 254", "joaquim@email.com");
        Pessoa pessoa5 = new Pessoa("Ines", 23, "956 357 142", "ines@email.com");

        Sorteio sorteio = new Sorteio(5000);

        sorteio.addParticipante(pessoa1);
        sorteio.addParticipante(pessoa2);
        sorteio.addParticipante(pessoa3);
        sorteio.addParticipante(pessoa4);
        sorteio.addParticipante(pessoa5);

        sorteio.exibirDetalhes();

    }
}
