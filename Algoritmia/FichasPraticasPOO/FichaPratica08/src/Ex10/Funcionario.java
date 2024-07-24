package Ex10;

public class Funcionario {

    private String nome;
    private double salario;
    private Departamento departamento;

    /**
     * Método para construir Funcionário
     *
     * @param nome         Nome do Funcionário
     * @param salario      Salário do Funcionário
     * @param departamento Departamento onde o Funcionário trabalha
     */
    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }


    /**
     * Incrementa valor do salário do Funcionário
     * @param percentualAumento Valor percentual do aumento a ser incrementado
     */
    public void aumentarSalario(double percentualAumento) {
        this.salario *= (1 + percentualAumento);
    }

    /**
     * Exibe dados do Fucnionário
     */
    public void exibirDados() {
        System.out.println("-- Dados do Funcionário --");
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: $ " + this.salario);

    }
}
