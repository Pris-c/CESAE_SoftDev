package Ex02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    /**
     * Método para construir Sorteio
     * @param premio Valor do Prêmio
     */
    public Sorteio(double premio) {
        this.premio = premio;
        this.listaParticipantes = new ArrayList<>();
    }

    /**
     * Adiciona novo participante ao sorteio
     * @param novoParticipante Pessoa a ser adicionada
     */
    public void addParticipante(Pessoa novoParticipante){
        if (novoParticipante.getIdade() >= 18){
            this.listaParticipantes.add(novoParticipante);
            System.out.println(novoParticipante.getNome() + " adicionado com sucesso!");
        } else {
            System.out.println("Não é possível inscrever " + novoParticipante.getNome() + " pois é menor de 18 anos.");
        }
    }

    /**
     * Sorteia um vencedor para o sorteio utilizando um número aleatório
     * @return Pessoa vencedora do sorteio
     */
    public Pessoa sortear(){
        Random rd = new Random();
        int indexSorteado = rd.nextInt(this.listaParticipantes.size());
        return this.listaParticipantes.get(indexSorteado);
    }

    /**
     * Imprime a lista de participantes do Sorteio
     */
    public void exibirDetalhes(){
        System.out.println("*** Lista de participantes ***");
        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            System.out.print("Participante " + (i+1) + ": ");
            this.listaParticipantes.get(i).exibirDetalhes();
        }
    }
}
