package Ex01;

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    /**
     * Método para construir Musica
     * @param titulo Título da Música
     * @param genero Genero da Música
     * @param artista Artista da Música
     * @param duracao Duração da Música em segundos
     */
    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    /**
     * Imprime as informações sobre uma Música
     */
    public void imprimirDetalhes(){
        System.out.println("Título: " + this.titulo + " | Gênero: " + this.genero + " | Artista: " + this.artista + " | Duração: " + this.duracao + "s.");

    }
}
