package Ex03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private Double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscosPescados;

    /**
     * Método para construir Barco de Pesca
     * @param nome nome do Barco
     * @param cor cor do Barco
     * @param anoFabrico ano de fabrico do Barco
     * @param tripulacao numero máximo de tripulantes
     * @param capacidadeCarga carga máxima suportada em kg
     * @param marca Marca do Barco
     */
    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, Double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixesPescados = new ArrayList<>();
        this.mariscosPescados = new ArrayList<>();
    }

    /**
     * Adiciona Peixe no Array de Peixes Pescados se o Barco comportar seu peso
     * @param peixe Peixe a ser adicionado
     */
    public void pescar(Peixe peixe){
        if (calcularCargaAtual() + peixe.getPeso() > this.capacidadeCarga){
            System.out.println("Peixe não adicionado! Barco não suporta seu peso.");
            return;
        }
        this.peixesPescados.add(peixe);
    }

    /**
     * Adiciona Marisco no Array de Mariscos Pescados se o Barco comportar seu peso
     * @param marisco Marisco a ser adicionado
     */
    public void pescar(Marisco marisco){
        if (calcularCargaAtual() + marisco.getPeso() > this.capacidadeCarga){
            System.out.println("Marisco não adicionado! Barco não suporta seu peso.");
            return;
        }
        this.mariscosPescados.add(marisco);
    }


    /**
     * Remove o Peixe do Array de Peixes na posição do index informado
     * @param index Posição do Peixe a ser removido do Array
     */
    public void largarPeixe(int index){
        try {
            this.peixesPescados.remove(index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Índice " + index + " não existe no Array de Peixes Pescados.");
        }
    }

    /**
     * Remove o Marisco do Array de Mariscos na posição do index informado
     * @param index Posição do Marisco a ser removido do Array
     */
    public void largarMarisco(int index){
        try {
            this.mariscosPescados.remove(index);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Índice " + index + " não existe no Array de Mariscos Pescados.");
        }
    }

    /**
     * Calcula peso total em kg da carga atual do Barco
     * @return peso em kg da carga do Barco
     */
    public double calcularCargaAtual(){
        double pesoAtual = 0;

        for (Peixe p: this.peixesPescados) {
            pesoAtual += p.getPeso();
        }
        for (Marisco m: this.mariscosPescados) {
            pesoAtual += m.getPeso();
        }
        return pesoAtual;
    }

    /**
     * Calcula valor total da carga do Barco
     * @return Valor total em euros da carga do Barco
     */
    public double calcularValorTotal(){
        double total = 0;

        for (Peixe p: this.peixesPescados) {
            total += p.getPreco() * p.getPeso();
        }
        for (Marisco m: this.mariscosPescados) {
            total += m.getPreco() * m.getPeso();
        }
        return total;
    }

    /**
     * Calcula o salário a ser pago a cada membro da tripulação (exceto capitão)
     * @return salário devido a cada membro da tripulação, em euros
     */
    public double calcularSalarioTripulação(){
        double totalLiquido = calcularValorTotal() * 0.6;
        return totalLiquido / this.tripulacao;
    }

    /**
     * Exibe todos os detalhes do Barco
     */
    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + " | Cor: " + this.cor + " | Ano de Fabrico: " + this.anoFabrico + " | Tripulação: " + this.tripulacao + " | Capacidade de Carga: " + this.capacidadeCarga + " kg | Marca: " + this.marca);
        System.out.println("Peixes pescados: ");
        for (Peixe p: this.peixesPescados) {
            p.imprimirDetalhes();
        }
        System.out.println("Mariscos pescados: ");
        for (Marisco m: this.mariscosPescados) {
            m.imprimirDetalhes();
        }
    }

}
