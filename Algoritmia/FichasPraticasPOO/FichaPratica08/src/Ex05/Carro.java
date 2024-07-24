package Ex05;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;

    /**
     * Método para construir Carro
     * @param marca marca do Carro
     * @param modelo modelo do Carro
     * @param anoFabricacao ano de fabricação do Carro
     */
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }


    public void ligar(){
        System.out.println("O carro está ligado.");
    }
}
