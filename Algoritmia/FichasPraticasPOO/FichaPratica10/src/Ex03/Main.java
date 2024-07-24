package Ex03;

public class Main {
    public static void main(String[] args) {


        Peixe sardinha = new Peixe("Sardinha", 100, 10);
        Peixe peixeEspada = new Peixe("Peixe Espada", 150, 10);
        Peixe dourada = new Peixe("Dourada", 50, 10);

        Marisco carangueijo = new Marisco("Carangueijo", 200, 10);
        Marisco ameijoa = new Marisco("Ameijoa", 50, 10);
        Marisco lagosta = new Marisco("Lagosta", 150, 10);

        BarcoPesca barco = new BarcoPesca("Fixe", "branco", "2005", 5, 1500.0, Marca.QUICKSILVER);

        barco.pescar(dourada);
        barco.pescar(ameijoa);
        barco.largarMarisco(0);

        System.out.println("Carga: " + barco.calcularCargaAtual());

        barco.exibirDetalhes();




    }
}
