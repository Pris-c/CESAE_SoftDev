package Ex09;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Garrafa de água", 0.40);

        System.out.println("A comprar 5 unidades");
        produto1.comprar(5);
        System.out.println("A vender 2 unidades");
        produto1.vender(2);
        System.out.println("Estoque produto 1: " + produto1.getQuantidadeEmEstoque());

        System.out.println("A comprar 10 unidades");
        produto1.comprar(10);
        System.out.println("A vender 35 unidades");
        produto1.vender(35);


    }
}
