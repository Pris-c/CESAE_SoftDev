package Ex04;

public class Main {
    public static void main(String[] args) {


        Circulo circulo1 = new Circulo(3);

        System.out.println("-- Circulo 1 --");
        System.out.println("Area = " + circulo1.calcularArea());
        System.out.println("Perímetro = " + circulo1.calcularCircunferencia());
    }
}
