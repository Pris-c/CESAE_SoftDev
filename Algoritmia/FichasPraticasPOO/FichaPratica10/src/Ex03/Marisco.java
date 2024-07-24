package Ex03;

public class Marisco {

    private String especie;
    private double peso;
    private double preco;

    /**
     * Método para construir Marisco
     * @param especie do Marisco
     * @param peso do Marisco em kg
     * @param preco preço do Marisco em euro
     */
    public Marisco(String especie, double peso, double preco) {
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
