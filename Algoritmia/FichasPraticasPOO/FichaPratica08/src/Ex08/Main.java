package Ex08;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ricardo", 28, Curso.AWS, 10);
        Aluno aluno2 = new Aluno("Nuno", 37, Curso.SOFT_DEV, 9.45);

        System.out.println("Situação aluno " + aluno1.getNome() + ": " + aluno1.situacao());
        System.out.println("Situação aluno " + aluno2.getNome() + ": " + aluno2.situacao());
    }
}
