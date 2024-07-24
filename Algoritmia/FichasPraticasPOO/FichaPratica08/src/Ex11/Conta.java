package Ex11;

public class Conta {

    private String nConta;
    private double saldo;
    private String titular;

    public Conta(String nConta, double saldo, String titular) {
        this.nConta = nConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getnConta() {
        return nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
        Ao trabalhar nos métodos da classe, é possível acessar os atributos privados de qualquer objeto que pertença à classe
        O acesso não é restrito ao objeto que a invoca.
     */
    public void transferir(double valor, Conta contaDestinatario){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestinatario.saldo += valor;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void levantar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Levantamento não realizado. Saldo insuficiente.");
        }
    }

    public void exibirSaldo(){
        System.out.println("-- Conta " + nConta + " --");
        System.out.println("Saldo Atual: $ " + this.saldo);
        System.out.println();
    }


}
