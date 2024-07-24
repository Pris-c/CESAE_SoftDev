package Ex07;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Título 1", "Autor 1", "Aventura", 258, "2558455688");
        Livro livro2 = new Livro("Título 2", "Autor 2", "Ficção", 135, "45841254866");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
