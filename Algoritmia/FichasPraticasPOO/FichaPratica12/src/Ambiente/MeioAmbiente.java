package Ambiente;

import Seres.Animal;
import Seres.Enuns.Familia;
import Seres.Enuns.Periodo;
import Seres.Inseto;
import Seres.Planta;
import Seres.SerVivo;

import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {

    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;
    private SerVivo ultimoAMorrer;

    /**
     * Método para construir MeioAmbiente
     * @param nome Nome do MeioAmbiente
     * @param agua Quantidade de água disponível em litros
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<>();
        this.ultimoAMorrer = null;
    }

    /**
     * Adiciona um novo SerVivo ao Array de Seres Vivos
     * @param ser SerVivo a adicionar
     */
    public void addSerVivo(SerVivo ser){
        this.seres.add(ser);
    }

    /**
     * Exibe as informações de todos os seres no Array seres
     */
    public void listarSeresVivos(){
        System.out.println("Lista de seres: ");
        for (SerVivo ser: this.seres) {
            ser.exibirInformacoes();
        }
        System.out.println();
    }


    /**
     * Informa inicio de um novo dia,
     * Exibe informações sobre os seres no ambiente, e
     * Atribui valor "true" para fome de todos os animais
     */
    private void iniciarDia(){
        System.out.println("**** Um novo dia começa em " + this.nome + " ****");
        this.listarSeresVivos();

        ArrayList<Integer> animaisIndexes = this.getAnimaisIndexes();
        for (int i = 0; i < animaisIndexes.size(); i++){
            Animal animal = (Animal) this.seres.get(animaisIndexes.get(i));
            animal.setFome(true);
        }
    }


    /**
     * Simula uma sequencia de acontecimentos para o MeioAmbiente durante o período especificado
     * @param dias número de dias para duração da simulação
     */
    public void simulador(int dias){
        int contDias = 0;

        do {
            System.out.println("DIA " + (contDias+1));
            this.iniciarDia();
            Periodo periodo = Periodo.MANHÃ;

            for(int k = 0; k < 3; k++){
                System.out.println("-- " + periodo + " --");

                switch (randomNumber(1, 4)){
                    case 1:
                        acontecimentoPlanta();
                        break;
                    case 2:
                        acontecimentoAnimal();
                        break;
                    case 3:
                        acontecimentoInseto();
                        break;
                    case 4:
                        eventoNatural();
                        break;
                }

                if (periodo.equals(Periodo.MANHÃ)){
                    periodo = Periodo.TARDE;
                } else if (periodo.equals(Periodo.TARDE)){
                    periodo = Periodo.NOITE;
                } else {
                    periodo = Periodo.MANHÃ;
                }
            }

            this.alimentarAnimais();
            if (this.seres.isEmpty()){
                System.out.println("Não resta ser animal no ambiente.");
                System.out.println("Último sobrevivente: ");
                this.ultimoAMorrer.exibirInformacoes();
            } else {
                this.listarSeresVivos();
            }
            contDias++;

        } while (contDias < dias && !this.seres.isEmpty());

    }

    /**
     * Tenta alimentar todos os Animais com atributo fome = "true", e
     * Elimina do ambiente os que não conseguirem ser alimentados
     */
    public void alimentarAnimais(){
        System.out.println("\nO dia está acabando...");

        ArrayList<Integer> animaisIndexes = this.getAnimaisIndexes();

        if (!this.getAnimaisIndexes().isEmpty()){

            ArrayList<Animal> animaisFamintos = new ArrayList<>();

            for (int i = 0; i < animaisIndexes.size(); i++){

                int animalIndex = animaisIndexes.get(i);
                Animal animal = (Animal) this.seres.get(animalIndex);

                if (animal.estaComFome()){
                    boolean comeu = this.animalCome(animalIndex);
                    if (!comeu){
                        animaisFamintos.add(animal);
                    }
                }

                animaisIndexes = this.getAnimaisIndexes();
            }

            for(Animal a: animaisFamintos){
                System.out.println("Animal " + a.getNome() + "morreu de fome.");
                this.ultimoAMorrer = a;
            }
            this.seres.removeAll(animaisFamintos);
        }
    }


    /**
     * Escolhe e executa uma ação aleatória para uma Planta
     */
    private void acontecimentoPlanta(){
        int indexPlanta = escolherPlanta();
        if (indexPlanta != -1){
            switch (randomNumber(1, 2)){
                case 1:
                    this.plantaAbanaComVento(indexPlanta);
                    return;
                case 2:
                    Planta planta = (Planta) this.seres.get(indexPlanta);
                    if (planta.getFamilia().equals(Familia.COME_INSETOS)){
                        this.plantaComeInseto(indexPlanta);
                    } else {
                        this.plantaBebe(indexPlanta);
                    }
                    return;
            }
        }
        System.out.println("Nenhuma planta para agir.");
    }

    /**
     * Escolhe um acontecimento aleatório para acontecer com um Animal
     */
    private void acontecimentoAnimal(){
        int indexAnimal = escolherAnimal();
        if (indexAnimal != -1){
            int acontecimento = randomNumber(1, 4);

            switch (acontecimento){
                case 1:
                    this.animalCome(indexAnimal);
                    return;
                case 2:
                    this.animalBebe(indexAnimal);
                    return;
                case 3:
                    this.animalMovimenta(indexAnimal);
                    return;
                case 4:
                    this.animalFazBarulho(indexAnimal);
                    return;
            }
        }
        System.out.println("Não há animal para agir.");
    }

    /**
     * Executa ação com um Inseto
     */
    public void acontecimentoInseto(){
        int indexInseto = escolherInseto();
        if (indexInseto != -1){
            this.insetoChateia(indexInseto);
            return;
        }
        System.out.println("Não há inseto para agir.");
    }

    /**
     * Escolhe um evento natural para acontecer no ambiente
     */
    public void eventoNatural(){
        switch (randomNumber(1, 3)){
            case 1:
                this.seca();
                System.out.println("Uma seca atingiu o ambiente");
                break;
            case 2:
                this.chuva();
                System.out.println("Uma chuva abasteceu o ambiente");
                break;
            case 3:
                System.out.println("PERIGO! Está havendo uma erupção vulcânica!");
                this.erupcaoVulcanica();
                break;
        }
    }


    /**
     * Escolhe uma Planta aleatória no Array de Seres Vivos
     * @return index correspondente a uma Planta no Array de Seres Vivos ou -1, se nenhuma Planta for encontrada
     */
    private int escolherPlanta(){
        ArrayList<Integer> plantasIndexes = getPlantasIndexes();

        if (!plantasIndexes.isEmpty()){
            if (plantasIndexes.size() == 1){
                return plantasIndexes.get(0);
            }

            int randomIndex = randomNumber(0, plantasIndexes.size()-1);
            return plantasIndexes.get(randomIndex);
        }
        return -1;
    }

    /**
     * Escolhe um Animal aleatório no Array de Seres Vivos
     * @return index correspondente a um Animal no Array de Seres Vivos ou -1, se nenhum Animal for encontrado
     */
    private int escolherAnimal(){
        ArrayList<Integer> animaisIndexes = getAnimaisIndexes();

        if (!animaisIndexes.isEmpty()){
            if (animaisIndexes.size() == 1){
                return animaisIndexes.get(0);
            }
            int randomIndex = randomNumber(0, animaisIndexes.size()-1);

            return animaisIndexes.get(randomIndex);
        }
        return -1;
    }


    /**
     * Escolhe um Inseto aleatório no Array de Seres Vivos
     * @return index correspondente a um Inseto no Array de Seres  ou -1, se nenhum Inseto for encontrado
     */
    private int escolherInseto(){
        ArrayList<Integer> insetosIndexes = new ArrayList<>();

        for (int i = 0; i < this.seres.size(); i++){
            if (this.seres.get(i) instanceof Inseto){
                insetosIndexes.add(i);
            }
        }

        if (!insetosIndexes.isEmpty()){
            if (insetosIndexes.size() == 1){
                return insetosIndexes.get(0);
            }
            int randomIndex = randomNumber(0, insetosIndexes.size()-1);
            return insetosIndexes.get(randomIndex);
        }
        return -1;
    }


    /**
     * Gera consumo de água pela planta.
     * Se houver água suficiente no ambiente, remove o equivalente ao consumo da Planta,
     * Se não houver água suficiente no ambiente, remove a planta do Array de Seres Vivos
     * @param indexPlanta index da Planta que deve beber água no array de Seres Vivos
     */
    private void plantaBebe(int indexPlanta) {
        Planta planta = (Planta) this.seres.get(escolherPlanta());
        double consumoPlanta = planta.getConsumoAgua();

        if (this.agua >= consumoPlanta) {
            this.agua -= consumoPlanta;
            System.out.println("Planta " + planta.getNome() + " bebeu água.");
        } else {
            this.ultimoAMorrer = this.seres.remove(indexPlanta);
            System.out.println("Planta " + ultimoAMorrer.getNome() + " morreu de sede.");
        }
    }

    /**
     * Remove um Inseto do Array de Seres Vivos, se houver.
     * Do contrário, remove a Planta.
     * @param indexPlanta index da Planta que deve se alimentar do Inseto ou ser removida
     */
    private void plantaComeInseto(int indexPlanta){
        Planta planta = (Planta) this.seres.get(indexPlanta);
        if (planta.getFamilia().equals(Familia.COME_INSETOS)){
            int indexInseto = this.escolherInseto();
            if (indexInseto != -1){
                this.ultimoAMorrer = this.seres.remove(indexInseto);
                System.out.println("Planta " + planta.getNome() + " comeu o inseto " + this.ultimoAMorrer.getNome() + ".");
                return;
            } else {
                ultimoAMorrer = this.seres.remove(indexPlanta);
                System.out.println("Planta " + ultimoAMorrer.getNome() + " morreu de fome.");
                return;
            }
        }
        System.out.println("⚠\uFE0F" + planta.getNome() + "não comeu, pois não é carnívora.");
    }

    /**
     * Exibe mensagem sobre vento, identificando a Planta que está a agir.
     * @param indexPlanta Planta que irá realizar a ação
     */
    private void plantaAbanaComVento(int indexPlanta){
        if (indexPlanta != -1){
            Planta planta = (Planta) this.seres.get(indexPlanta);
            System.out.println(planta.getNome() + ": - Está muito vento!");
        }
    }


    /**
     * Escolhe um Animal para emitir o seu barulho característico
     * @param indexAnimal index do Animal no Array de seres
     */
    private void animalFazBarulho(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.print(animal.getNome() + ": ");
        animal.fazerBarulho();
    }

    /**
     * Escolhe um Animal para se movimentar
     * @param indexAnimal index do Animal no Array de Seres
     */
    private void animalMovimenta(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.println("O animal " + animal.getNome() + " movimentou-se");
    }


    /**
     * Gera consumo de água pelo Animal.
     * Se houver água suficiente no ambiente, remove o equivalente ao consumo do Animal,
     * Se não houver água suficiente no ambiente, remove o Animal do Array de Seres Vivos
     * @param indexAnimal index do Animal que deve beber água no array de seres
     */
    private void animalBebe(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        double consumoAnimal = animal.getConsumoAgua();

        if (this.agua >= consumoAnimal){
            this.agua -= consumoAnimal;
            System.out.println("Animal " + animal.getNome() + " bebeu água.");
        } else {
            this.ultimoAMorrer = this.seres.remove(indexAnimal);
            System.out.println("Animal " + ultimoAMorrer.getNome() + " morreu de sede.");
        }
    }

    /**
     * Tenta alimentar o Animal de acordo com sua dieta
     * @param indexAnimal  index do Animal que deve ser alimentado no array de seres
     * @return true, se a tentativa teve um desfecho, false, se a tentativa não foi completada
     */
    private boolean animalCome(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        int opcaoComida = 1;

        if (!animal.estaComFome()){
            System.out.println(animal.getNome() + " está de barriga cheia.");

        } else {
            switch (animal.getDieta()){
                case CARNIVORA:
                   opcaoComida = randomNumber(2,3);
                case OMNIVORA:
                   opcaoComida = randomNumber(1, 3);
            }

            switch (opcaoComida){
                case 1:
                    return animalComerPlanta(indexAnimal);
                case 2:
                    return animalComerAnimal(indexAnimal);
                case 3:
                    animalComerInseto(indexAnimal);
                    return true;
            }
        }
        return true;
    }

    /**
     * Tenta alimentar um Animal com outro Animal
     * @param indexAnimal index do Animal que deve ser alimentado no array de seres
     * @return true, se o animal conseguir se alimentar, false, caso contrário
     */
    private boolean animalComerAnimal(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);

        if (getAnimaisIndexes().size() > 1){
            int indexAlimento;

            do{
                indexAlimento = escolherAnimal();

            } while (indexAnimal == indexAlimento);

            Animal alimento = (Animal) this.seres.get(indexAlimento);

            if (animal.getIndiceCapacidade() > alimento.getIndiceCapacidade()){
                this.ultimoAMorrer = this.seres.remove(indexAlimento);
                animal.setFome(false);
                System.out.println("Animal " + animal.getNome() + " comeu o animal " + this.ultimoAMorrer.getNome());
                return true;
            }

            System.out.println("Animal " + animal.getNome() + " tentou comer o animal " + alimento.getNome() + ", mas não conseguiu.");
            return false;
        }

        System.out.println("Animal " + animal.getNome() + " tentou comer outro animal, mas ele é o único no ambiente.");
        return false;
    }

    /**
     * Tenta alimentar Animal com uma Planta
     * @param indexAnimal index do Animal que deve ser alimentado no array de seres
     * @return true, se o animal conseguir se alimentar, false, caso contrário
     */
    private boolean animalComerPlanta(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);

        int indexPlanta = escolherPlanta();
        boolean animalCome = false;

        if (indexPlanta != -1) {
            Planta planta = (Planta) this.seres.get(escolherPlanta());

            switch (planta.getGrauDefesa()){
                case 0:
                    animalCome = true;
                    break;
                case 1:
                    if (animal.getInteligencia() >= 20){
                        animalCome = true;
                        break;
                    }
                case 2:
                    if (animal.getInteligencia() >= 40){
                        animalCome = true;
                        break;
                    }
                case 3:
                    if (animal.getInteligencia() >= 60){
                        animalCome = true;
                        break;
                    }
                case 4:
                    if (animal.getInteligencia() >= 80){
                        animalCome = true;
                        break;
                    }
                case 5:
                    if (animal.getInteligencia() >= 95){
                        animalCome = true;
                        break;
                    }
            }

            if (animalCome){
                this.ultimoAMorrer = this.seres.remove(indexPlanta);
                animal.setFome(false);
                System.out.println("Animal " + animal.getNome() + " comeu a planta " + this.ultimoAMorrer.getNome());
                return true;
            }
            System.out.println("Animal " + animal.getNome() + " tentou comer a planta " + planta.getNome() + ", mas não conseguiu.");
            return false;

        }
        System.out.println("Animal " + animal.getNome() + " tentou comer uma planta, mas não há nenhuma no ambiente.");
        return false;
    }

    /**
     * Tenta alimentar Animal com um Inseto

     */
    public boolean animalComerInseto(int indexAnimal){
        int indexInseto = escolherInseto();
        Animal animal = (Animal) this.seres.get(indexAnimal);

        if (indexInseto != -1){
            Inseto inseto = (Inseto) this.seres.get(indexInseto);

            if (inseto.isVenenoso()){
                this.ultimoAMorrer = this.seres.remove(indexAnimal);
                System.out.println("Animal " + ultimoAMorrer.getNome() + " morreu ao tentar comer o inseto " + inseto.getNome() + ".");
                return false;
            } else {
                this.ultimoAMorrer = this.seres.remove(indexInseto);
                System.out.println("Animal " + animal.getNome() + " comeu o inseto " + ultimoAMorrer.getNome() + ".");
                animal.setFome(false);
                return true;
            }
        }
        System.out.println("Animal " + animal.getNome() + " tentou comer um inseto, mas não há nenhum no ambiente.");
        return true;
    }


    /**
     * Exibe zumbido de um Inseto
     * @param indexInseto index no Array de seres do Inseto que deve zumbir
     */
    public void insetoChateia(int indexInseto){
        Inseto inseto = (Inseto) this.seres.get(indexInseto);
        inseto.zumbir(randomNumber(1, 3));
    }


    /**
     * Remove metade da quantidade de água do ambiente
     */
    public void seca(){
        this.agua *= 0.5;
    }

    /**
     * Dobra a quantidade de água do ambiente
     */
    public void chuva(){
        this.agua *= 2;
    }

    /**
     * Elimina metade das Plantas e metade dos Animais do ambiente
     */
    public void erupcaoVulcanica(){
        this.eliminarMetadeDosSeres(this.getPlantasIndexes());
        this.eliminarMetadeDosSeres(this.getAnimaisIndexes());
    }

    /**
     * Elimina metade do seres recebidos do Array de seres
     * @param seresIndexes indexes dos SeresVivos a serem considerados para remoção
     */
    public void eliminarMetadeDosSeres(ArrayList<Integer> seresIndexes){
        if (!seresIndexes.isEmpty()){
            if (seresIndexes.size() == 1){
                int index = seresIndexes.getFirst();
                this.ultimoAMorrer = this.seres.remove(index);
                System.out.println("Ser " + this.ultimoAMorrer.getNome() + " morreu.");
                return;
            }

            int qtdEliminar = seresIndexes.size() / 2 ;
            for (int i = 0; i < qtdEliminar; i++){
                int index = seresIndexes.get(i);
                this.ultimoAMorrer = this.seres.remove(index);
                System.out.println("Ser " + this.ultimoAMorrer.getNome() + " morreu.");
            }
        }
    }


    /**
     * Extrai indexes de todas as Plantas no Array de seres
     * @return Array com os indexes das Plantas
     */
    private ArrayList<Integer> getPlantasIndexes(){
        ArrayList<Integer> plantasIndexes = new ArrayList<>();

        for (int i = 0; i < this.seres.size(); i++){
            if (this.seres.get(i) instanceof Planta){
                plantasIndexes.add(i);
            }
        }

        return plantasIndexes;

    }

    /**
     * Extrai indexes de todos os Animais no Array de seres
     * @return Array com os indexes dos Animais
     */
    private ArrayList<Integer> getAnimaisIndexes(){

        ArrayList<Integer> animaisIndexes = new ArrayList<>();

        for (int i = 0; i < this.seres.size(); i++){
            if (this.seres.get(i) instanceof Animal){
                animaisIndexes.add(i);
            }
        }
        return animaisIndexes;

    }

    /**
     * Retorna uma número inteiro aleátorio no intervalo determinado
     * @param min Menor valor do intervalo
     * @param max Maior valor do intervalo
     * @return Valor inteiro no intervalo determinado
     */
    private int randomNumber(int min, int max){
        Random rd = new Random();
        return rd.nextInt(min, max+1);
    }

}
