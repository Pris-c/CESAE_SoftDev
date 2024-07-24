package Ex06;

public class Calculadora {


    public void somar(double n1, double n2) {
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    }

    public void subtrair(double n1, double n2) {
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public void multiplicar(double n1, double n2) {
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    }

    public void dividir(double n1, double n2) {
        if (n2 == 0){
            System.out.println("Divisão impossível");
        } else {
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        }
    }


}
