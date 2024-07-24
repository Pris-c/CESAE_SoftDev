package Ex01;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    /**
     * Método para criar MusicPlayer
     */
    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    public ArrayList<Musica> getProgramacao() {
        return programacao;
    }

    /**
     * Adiciona música à lista de execução programada
     * @param musica Musica a ser adiconada
     */
    public void addMusica(Musica musica){
        this.programacao.add(musica);
    }

    /**
     * Inverte todas as ocorrências das músicas recebidas
     * @param musica1 Musica a ter ocorrências substituídas pela musica2
     * @param musica2 Musica a ter ocorrências substituídas pela musica1
     */
    public void trocarMusica(Musica musica1, Musica musica2){
        for (int i = 0; i < this.programacao.size(); i++){
            if (this.programacao.get(i).equals(musica1)){
                this.programacao.set(i, musica2);
            } else if (this.programacao.get(i).equals(musica2)) {
                this.programacao.set(i, musica1);
            }
        }
    }

    /**
     * Troca a posição da musicas nos indexes especificados
     * @param indexMusica1 Posicao da primeira música a ser trocada
     * @param indexMusica2 Posicao da segunda música a ser trocada
     */
    public void trocarMusica(int indexMusica1, int indexMusica2){
       Musica musica1 = this.programacao.get(indexMusica1);
       Musica musica2 = this.programacao.get(indexMusica2);
       this.programacao.set(indexMusica1, musica2);
       this.programacao.set(indexMusica2, musica1);
    }


    /**
     * Remove a primeira ocorrência da Musica especificada do Array programação
     * @param musica Musica a ser removida
     * @return true se música foi encontrada e removida do array, false, se não houver nenhuma instancia da Musica no array
     */
    public boolean removerPrimeiraOcorrencia(Musica musica){
        return this.programacao.remove(musica);
    }

    /**
     * Remove todas as ocorrências da Musica especificada do Array programação
     * @param musica Musica a ter ocorrências removidas
     * @return true se música foi encontrada e removida do array, false, se não houver nenhuma instancia da musica no array
     */
    public boolean removerTodasOcorrencias(Musica musica){
        boolean revoved = false;
        for (int i = 0; i < this.programacao.size(); i++){
            if (musica.equals(this.programacao.get(i))){
                this.programacao.remove(i);
                revoved = true;
                i--;
            }
        }
        return revoved;
    }

    /**
     * Remove a Musica na posição especificada do Array Programação
     * @param index Posição da Música na lista de execução
     * @return A Musica removida ou "null", se index for inválido
     */
    public Musica removerMusica(int index){
        try{
            return this.programacao.remove(index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index " + index + " não existe na lista de Programação atual.");
            return null;
        }
    }

    /**
     * Remove todos os elementos do Array programação
     */
    public void limparProgramacao(){
        this.programacao.clear();
    }

    /**
     * Imprime somatório dos tempos de duração das músicas no Array programação
     */
    public void imprimirDuracao(){
        int soma = 0;
        for (Musica m: this.programacao) {
            soma += m.getDuracao();
        }

        int hora = soma / (3600);
        soma = soma % 3600;
        int min = soma / 60;
        int seg = soma % 60;

        System.out.print("Duração da Programação: ");
        System.out.println(hora + ":" + min + ":" + seg);
    }

    /**
     * Imprime relatório com todas as músicas do Array programação
     */
    public void imprimirRelatorio(){
        if (this.programacao.isEmpty()){
            System.out.println("** Não há nenhuma música na Programação **");
        } else {
            System.out.println("** Programação **");
            int i = 1;
            for (Musica m : this.programacao) {
                System.out.print("Música " + i++ + ": ");
                m.imprimirDetalhes();
            }
        }
    }
}
