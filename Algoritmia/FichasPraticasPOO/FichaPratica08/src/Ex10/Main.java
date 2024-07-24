package Ex10;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Maria", 2000, Departamento.ADMINISTRAÇÃO);

        funcionario1.aumentarSalario(0.10);
        funcionario1.exibirDados();

    }
}
