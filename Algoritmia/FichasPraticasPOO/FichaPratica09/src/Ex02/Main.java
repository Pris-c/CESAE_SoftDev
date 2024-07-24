package Ex02;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("12345", 500, "Paola");

        conta.exibirSaldo();
        System.out.println("Emprestimo efetuado? " + conta.pedirEmprestimo(40));
        conta.exibirSaldo();
        System.out.println("Valor em dívida: $ " + conta.getValorEmDivida());

    }
}
