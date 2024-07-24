package Ex11;

public class Main {
    public static void main(String[] args) {


        System.out.println("-- A criar conta 1 com saldo igual a $ 2500 ");
        Conta conta1 = new Conta("1", 2500, "Josias");
        System.out.println("-- A depositar $ 1000 na conta 123");
        conta1.depositar(1000);
        conta1.exibirSaldo();

        System.out.println("\n-- A depositar $ 120 na conta 1");
        conta1.depositar(120);
        conta1.exibirSaldo();

        System.out.println("\n-- A criar contas 2 e 3, com saldos de $ 5000 e $ 400, respectivamente");
        Conta conta2 = new Conta("2", 5000, "Priscila");
        Conta conta3 = new Conta("3", 400, "Joana");

        System.out.println("-- A transferir $ 300 da conta 2 para conta 3");
        conta2.transferir(300, conta3);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();
    }
}
