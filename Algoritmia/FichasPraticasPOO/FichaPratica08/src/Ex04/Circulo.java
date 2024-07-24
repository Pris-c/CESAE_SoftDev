package Ex04;

public class Circulo {

    private double raio;

    /**
     * Método para construir Circulo
     * @param raio raio do círculo em cm
     */
    public Circulo(double raio) {
        this.raio = raio;
    }


    public double calcularArea(){
        return (this.raio * this.raio) * 3.14;
    }

    public double calcularCircunferencia(){
        return 2 * 3.14 * this.raio;
    }

}
