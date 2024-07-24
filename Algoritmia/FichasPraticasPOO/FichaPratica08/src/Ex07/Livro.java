package Ex07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int nPaginas;
    private String ISBN;

    public Livro(String titulo, String autor, String categoria, int nPaginas, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nPaginas = nPaginas;
        this.ISBN = ISBN;
    }

    public void exibirDetalhes(){
        System.out.println("Detalhamento do livro: ");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Número de páginas: " + this.nPaginas);
        System.out.println();

    }



}
