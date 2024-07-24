package Ex08;

public class Aluno {
    private String nome;
    private int idade;
    private Curso curso;
    private double media;

    /**
     * Método para construir Aluno
     * @param nome Nome do Aluno
     * @param idade Idade do Aluno
     * @param curso Curso no qual o aluno está matriculado
     * @param media Média de notas do aluno
     */
    public Aluno(String nome, int idade, Curso curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public Situacao situacao(){
        if (media >= 9.5){
            return Situacao.APROVADO;
        } else {
            return Situacao.REPROVADO;
        }
    }





}
