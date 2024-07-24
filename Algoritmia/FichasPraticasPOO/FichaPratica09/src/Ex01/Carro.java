package Ex01;

import java.time.LocalDateTime;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int potencia;
    private int cilindrada;
    private Combustivel tipoCombustivel;
    private double litros100km;

    public Carro() {
    }

    /**
     * Método para construir Carro
     * @param marca Marca do Carro
     * @param modelo Modelo do Carro
     * @param anoFabricacao Ano em que o Carro foi fabricado
     * @param potencia Potencia do Carro em PS
     * @param cilindrada Cilindrada do Carro em cm3
     * @param tipoCombustivel Tipo de Combustível que abastece o Carro
     * @param litros100km Quantidade de litros de combustível necessária para o Carro andar 100km
     */
    public Carro(String marca, String modelo, int anoFabricacao, int potencia, int cilindrada, Combustivel tipoCombustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100km = litros100km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public Combustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getLitros100km() {
        return litros100km;
    }

    /**
     * Exibe mensagem personalizada de acordo com as caracteristicas do carro
     */
    public void ligar(){
        String output;
        if (this.getIdade() > 30){
            if (this.tipoCombustivel.equals(Combustivel.DIESEL)){
                output = "Deita um pouco de fumo... Custa a pegar... O carro está ligado!\nVrum-vrum-vrum";
            } else{
                output = "Custa a pegar... O carro está ligado!\nVrum-vrum-vrum";
            }
        } else {
            if (this.potencia < 250){
                output = "O carro está ligado!\nVruummmmmmmm";
            } else {
                output = "O carro está ligado!\nVRUUMMMMMM";
            }
        }
        System.out.println(output);
    }

    /**
     * Simula uma corrida e utiliza comparações dos atributos dos Carros recebidos para definir vencedor.
     * Ganha o carro com maior potência, seguida pelos critérios de desempate: maior cilindrada e menor idade.
     * @param adversario Carro a ser comparado
     * @return Carro vencedor, se houver, ou null, se ocorrer empate.
     */
    public Carro corrida(Carro adversario){

        if (this.potencia > adversario.potencia){
            return this;
        } else  if (this.potencia == adversario.potencia){
            if (this.cilindrada > adversario.cilindrada){
                return this;
            } else if (this.cilindrada == adversario.cilindrada){

                if (this.getIdade() < adversario.getIdade()){
                    return this;
                } else if (this.getIdade() > adversario.getIdade()){
                    return adversario;
                }
            }
        } else {
            return adversario;
        }
        return null;
    }

    /**
     * Calcula o consumo de combustível em litros para o Carro percorrer a distância informada em km.
     * @param distancia Distancia a ter consumo de combustível calculado, em km.
     * @return Quantidade de litros necessária para percorrer a distância informada.
     */
    public double calcularConsumo(double distancia){
        return this.litros100km / 100 * distancia;
    }

    public int getIdade(){
        return 2024 - this.anoFabricacao;
    }

}
