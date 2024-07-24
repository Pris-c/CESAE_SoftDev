import Ambiente.MeioAmbiente;
import Seres.Animal;
import Seres.Enuns.Alimentacao;
import Seres.Enuns.Familia;
import Seres.Inseto;
import Seres.Planta;

public class Main {
    public static void main(String[] args) {

        MeioAmbiente ambiente = new MeioAmbiente("PriscilaVerso", 200);

        ambiente.addSerVivo(new Animal("Leão Leo", "Leão", "África", 5, true, 190.5, 85, Alimentacao.CARNIVORA, "Rugido"));
        ambiente.addSerVivo(new Animal("Elefante Milo", "Elefante", "Índia", 10, false, 5400.3, 70, Alimentacao.HERBIVORA, "Trumpet"));
        ambiente.addSerVivo(new Animal("Cachorro Rex", "Cachorro", "EUA", 3, true, 25.0, 60, Alimentacao.OMNIVORA, "Latido"));
        ambiente.addSerVivo(new Animal("Gato Whiskers", "Gato", "Brasil", 2, false, 4.5, 75, Alimentacao.CARNIVORA, "Miau"));
        ambiente.addSerVivo(new Animal("Vaca Bella", "Vaca", "Argentina", 4, true, 700.0, 50, Alimentacao.HERBIVORA, "Mugido"));
        ambiente.addSerVivo(new Animal("Papagaio Polly", "Papagaio", "Brasil", 6, false, 1.0, 90, Alimentacao.OMNIVORA, "Canto"));
        ambiente.addSerVivo(new Animal("Peixe Nemo", "Peixe", "Austrália", 1, true, 0.2, 40, Alimentacao.OMNIVORA, "Bolhas"));
        ambiente.addSerVivo(new Animal("Macaco Caco", "Macaco", "Indonésia", 7, false, 32.5, 80, Alimentacao.OMNIVORA, "Guincho"));
        ambiente.addSerVivo(new Animal("Urso Koda", "Urso", "Canadá", 8, true, 300.0, 65, Alimentacao.OMNIVORA, "Rugido"));
        ambiente.addSerVivo(new Animal("Coelho Benny", "Coelho", "Inglaterra", 3, false, 1.2, 55, Alimentacao.HERBIVORA, "Squeak"));


        ambiente.addSerVivo(new Planta("Oak", "Carvalho", "EUA", 100, Familia.ARVORES, 4));
        ambiente.addSerVivo(new Planta("Rose", "Rosa", "França", 2, Familia.FLORES, 3));
        ambiente.addSerVivo(new Planta("Mint", "Hortelã", "Marrocos", 2, Familia.ERVAS, 2));
        ambiente.addSerVivo(new Planta("Venus Flytrap", "Dioneia", "EUA", 1, Familia.COME_INSETOS, 5));
        ambiente.addSerVivo(new Planta("Pine", "Pinheiro", "Canadá", 50, Familia.ARVORES, 3));
        ambiente.addSerVivo(new Planta("Tulip", "Tulipa", "Holanda", 1, Familia.FLORES, 2));
        ambiente.addSerVivo(new Planta("Basil", "Manjericão", "Índia", 1, Familia.ERVAS, 2));
        ambiente.addSerVivo(new Planta("Pitcher Plant", "Planta jarro", "Indonésia", 3, Familia.COME_INSETOS, 4));
        ambiente.addSerVivo(new Planta("Maple", "Acer", "Japão", 80, Familia.ARVORES, 3));
        ambiente.addSerVivo(new Planta("Daisy", "Margarida", "Alemanha", 2, Familia.FLORES, 1));
        ambiente.addSerVivo(new Planta("Lavender", "Lavanda", "França", 3, Familia.ERVAS, 3));
        ambiente.addSerVivo(new Planta("Butterwort", "Pinguicula", "México", 2, Familia.COME_INSETOS, 4));
        ambiente.addSerVivo(new Planta("Cedar", "Cedro", "Líbano", 60, Familia.ARVORES, 4));
        ambiente.addSerVivo(new Planta("Sunflower", "Girassol", "EUA", 1, Familia.FLORES, 1));
        ambiente.addSerVivo(new Planta("Thyme", "Tomilho", "Grécia", 2, Familia.ERVAS, 2));
        ambiente.addSerVivo(new Planta("Sundew", "Drosera", "Austrália", 2, Familia.COME_INSETOS, 5));
        ambiente.addSerVivo(new Planta("Birch", "Bétula", "Rússia", 40, Familia.ARVORES, 3));
        ambiente.addSerVivo(new Planta("Lily", "Lírio", "Egito", 1, Familia.FLORES, 1));
        ambiente.addSerVivo(new Planta("Oregano", "Orégano", "Itália", 3, Familia.ERVAS, 2));
        ambiente.addSerVivo(new Planta("Bladderwort", "Utricularia", "Brasil", 2, Familia.COME_INSETOS, 4));


        ambiente.addSerVivo(new Inseto("Butterfly", "Borboleta", "Brasil", 1, false));
        ambiente.addSerVivo(new Inseto("Bee", "Abelha", "EUA", 1, true));
        ambiente.addSerVivo(new Inseto("Ant", "Formiga", "Austrália", 2, false));
        ambiente.addSerVivo(new Inseto("Beetle", "Besouro", "África do Sul", 1, false));
        ambiente.addSerVivo(new Inseto("Mosquito", "Mosquito", "Índia", 1, true));
        ambiente.addSerVivo(new Inseto("Dragonfly", "Libélula", "Canadá", 2, false));
        ambiente.addSerVivo(new Inseto("Mantis", "Louva-a-deus", "China", 1, false));
        ambiente.addSerVivo(new Inseto("Caterpillar", "Lagarta", "França", 1, false));
        ambiente.addSerVivo(new Inseto("Spider", "Aranha", "Brasil", 1, true));
        ambiente.addSerVivo(new Inseto("Cricket", "Grilo", "Japão", 2, false));
        ambiente.addSerVivo(new Inseto("Ladybug", "Joaninha", "Alemanha", 1, false));
        ambiente.addSerVivo(new Inseto("Wasp", "Vespa", "Itália", 1, true));
        ambiente.addSerVivo(new Inseto("Firefly", "Vaga-lume", "EUA", 1, false));
        ambiente.addSerVivo(new Inseto("Grasshopper", "Gafanhoto", "México", 1, false));
        ambiente.addSerVivo(new Inseto("Termite", "Cupim", "Brasil", 2, false));
        ambiente.addSerVivo(new Inseto("Scorpion", "Escorpião", "Egito", 2, true));
        ambiente.addSerVivo(new Inseto("Fly", "Mosca", "Rússia", 1, false));
        ambiente.addSerVivo(new Inseto("Hornet", "Zangão", "Espanha", 1, true));
        ambiente.addSerVivo(new Inseto("Moth", "Mariposa", "Tailândia", 1, false));
        ambiente.addSerVivo(new Inseto("Tick", "Carrapato", "Brasil", 1, true));

        ambiente.simulador(7500);

    }
}