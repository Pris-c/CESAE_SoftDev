package Ex03;

public class Retangulo {
    private double altura;
    private double largura;

    /**
     * Método construtor para Retângulo
     * @param altura altura do retângulo em cm
     * @param largura largura do retênagulo em cm
     */
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }


    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return 2 * this.largura * this.altura;
    }

}
