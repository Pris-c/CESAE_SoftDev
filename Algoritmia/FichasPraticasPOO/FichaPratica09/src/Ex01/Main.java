package Ex01;

public class Main {
    public static void main(String[] args) {

        Carro peugeot208 = new Carro("Peugeot ", "208", 2015, 68, 999, Combustivel.DIESEL, 3.4);
        Carro ghostSeriesII = new Carro("Rolls Royce", "Ghost Series II", 2015, 571, 6592, Combustivel.GPL, 14 );

        Carro vencedor = peugeot208.corrida(ghostSeriesII);
        System.out.printf("Vencedor da corrida: " + vencedor.getModelo());

        System.out.println();


        System.out.println();
        ghostSeriesII.ligar();
        System.out.println();

        System.out.println("Consumo Peugeot para 97 km: " + peugeot208.calcularConsumo(97));
        System.out.println("Consumo RR para 97 km: " + ghostSeriesII.calcularConsumo(97));
    }
}
