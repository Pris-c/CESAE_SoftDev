package Ex06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Atleta A", "Natação", 1.89, 81.9, "Argélia");
        Atleta atleta2 = new Atleta("Atleta B", "Atletismo", 1.75, 68.4, "Brasil");
        Atleta atleta3 = new Atleta("Atleta C", "Futebol", 1.82, 76.3, "Espanha");
        Atleta atleta4 = new Atleta("Atleta D", "Basquete", 2.05, 99.8, "Estados Unidos");
        Atleta atleta5 = new Atleta("Atleta E", "Tênis", 1.88, 80.2, "Suíça");
        Atleta atleta6 = new Atleta("Atleta F", "Boxe", 1.78, 70.5, "México");

        Competicao competicao1 = new Competicao("Mundial do Mundo", "Marrocos");
        Competicao competicao2 = new Competicao("Mundial de Atletas", "China");


        competicao1.adicionarAtleta(atleta1);
        competicao1.adicionarAtleta(atleta2);
        competicao1.adicionarAtleta(atleta3);

        competicao2.adicionarAtleta(atleta1);
        competicao2.adicionarAtleta(atleta4);
        competicao2.adicionarAtleta(atleta5);
        competicao2.adicionarAtleta(atleta6);

        competicao1.imprimirInformações();
        competicao2.imprimirInformações();


    }
}
