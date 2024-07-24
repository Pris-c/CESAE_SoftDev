package Ex02;

public class Conta {
    private String nConta;
    private double saldo;
    private String titular;
    private int anoDeAbertura = 2023;
    private double margemDeEmprestimo;
    private double valorEmDivida;

    /**
     * Método para construir Conta
     * @param nConta Número da Conta
     * @param saldo Saldo da Conta
     * @param titular Nome do titular da Conta
     */
    public Conta(String nConta, double saldo, String titular) {
        this.nConta = nConta;
        this.saldo = saldo;
        this.titular = titular;
        this.margemDeEmprestimo = saldo * 0.90;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.margemDeEmprestimo = saldo * 0.90;
    }

    /**
     * Transfere o valor de uma conta para outra
     * @param valor Valor a ser transferido
     * @param contaDestinatario Conta de destino da transferência
     */
    public void transferir(double valor, Conta contaDestinatario) {
        if (this.saldo >= valor) {
            this.setSaldo(this.saldo - valor);
            contaDestinatario.setSaldo(contaDestinatario.getSaldo() + valor);
        }
    }

    /**
     * Adiciona valor ao saldo
     * @param valor Valor a ser adicionado
     */
    public void depositar(double valor) {
        this.setSaldo(this.saldo + valor);
    }

    /**
     * Retira valor do saldo
     * @param valor Valor a ser removido
     */
    public void levantar(double valor) {
        if (this.saldo >= valor) {
            this.setSaldo(this.saldo - valor);
        } else {
            System.out.println("Levantamento não realizado. Saldo insuficiente.");
        }
    }

    /**
     * Exibe saldo atual
     */
    public void exibirSaldo() {
        System.out.println("-- Conta " + nConta + " --");
        System.out.println("Saldo Atual: $ " + this.saldo);
    }

    /**
     * Analisa pedido de empréstimo
     * @param valor Valor de empréstimo pedido pelo cliente
     * @return true, se o empréstimo for concedido, false, se o empréstimo for negado.
     */
    public boolean pedirEmprestimo(double valor){
        if (this.valorEmDivida > 0 || valor > this.margemDeEmprestimo){
            return false;
        }
        this.setSaldo(this.saldo + valor);
        this.valorEmDivida += valor;
        return true;
    }

}
