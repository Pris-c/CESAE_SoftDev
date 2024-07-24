package Ex09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque = 0;

    /**
     * Método para construir Produto
     * @param nome nome do Produto
     * @param preco Preço do Produto
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void comprar(int quantidade){
        quantidadeEmEstoque += quantidade;
    }
    public void vender(int quantidade){
        if (this.quantidadeEmEstoque > quantidade){
            quantidadeEmEstoque-= quantidade;
        } else {
            System.out.println("Venda não registrada. Estoque insuficiente.");
        }
    }
}

