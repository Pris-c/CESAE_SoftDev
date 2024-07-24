package Ex03;

public class Peixe {

    private String especie;
    private double peso;
    private double preco;

    /**
     * Método para construir Peixe
     * @param especie espécie do peixe
     * @param peso peso do peixe em kg
     * @param preco preço do peixe em euros
     */
    public Peixe(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public void imprimirDetalhes(){
        System.out.println("Espécie: " + this.especie + " | Peso: " + this.peso + " kg | Preço: " + this.preco + " euros");
    }
}
