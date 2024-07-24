package Ex01;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Bohemian Rhapsody", "Rock", "Queen", 335);
        Musica musica2 = new Musica("Shape of You", "Pop", "Ed Sheeran", 254);
        Musica musica3 = new Musica("Blinding Lights", "Synthwave", "The Weeknd", 200);
        Musica musica4 = new Musica("Someone Like You", "Soul", "Adele", 285);
        Musica musica5 = new Musica("Hotel California", "Rock", "Eagles", 390);
        Musica musica6 = new Musica("Thriller", "Pop", "Michael Jackson", 357);


        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.addMusica(musica1);
        musicPlayer.addMusica(musica2);
        musicPlayer.addMusica(musica3);
        musicPlayer.addMusica(musica1);
        musicPlayer.addMusica(musica4);
        musicPlayer.addMusica(musica5);
        musicPlayer.addMusica(musica6);
        musicPlayer.addMusica(musica6);

        System.out.println("\n ----- Adicionar 6 músicas à Programação");
        musicPlayer.imprimirRelatorio();
        musicPlayer.imprimirDuracao();

        System.out.println("\n ----- Trocar posição da primeira com a última");
        musicPlayer.trocarMusica(0, musicPlayer.getProgramacao().size()-1);
        musicPlayer.imprimirRelatorio();
        musicPlayer.imprimirDuracao();

        System.out.println("\n ----- Remover música na posição 10");
        musicPlayer.removerMusica(10);
        musicPlayer.imprimirRelatorio();
        musicPlayer.imprimirDuracao();

        System.out.println("\n ----- Remover música na posição 3");
        musicPlayer.removerMusica(3);
        musicPlayer.imprimirRelatorio();
        musicPlayer.imprimirDuracao();


        System.out.println("\n ----- Remover primeira ocorrencia de musica duplicada no array");
        musicPlayer.removerPrimeiraOcorrencia(musica6);
        musicPlayer.imprimirRelatorio();
        musicPlayer.imprimirDuracao();

        System.out.println("\n ----- Adicionar novas instancias da musica Thriller");
        musicPlayer.addMusica(musica6);
        musicPlayer.addMusica(musica6);
        musicPlayer.addMusica(musica6);
        musicPlayer.imprimirRelatorio();

        System.out.println("\n ----- Remover todas as instancias da musica Thriller");
        musicPlayer.removerTodasOcorrencias(musica6);
        musicPlayer.imprimirRelatorio();


        System.out.println("\n ----- Remover todas as músicas");
        musicPlayer.limparProgramacao();
        musicPlayer.imprimirRelatorio();

    }
}
