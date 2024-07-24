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

    /**
     * Método para construir MeioAmbiente
     * @param nome Nome do MeioAmbiente
     * @param agua Quantidade de água disponível em litros
     */
    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<>();
    }

    /**
     * Adiciona um novo SerVivo ao Array de Seres Vivos
     * @param ser SerVivo a adicionar
     */
    public void addSerVivo(SerVivo ser){
        this.seres.add(ser);
    }

    /**
     * Exibe as informações de todos os seres no Array de Seres Vivos
     */
    public void listarSeresVivos(){
        System.out.println("**** " + this.nome + " ****");
        for (SerVivo ser: this.seres) {
            ser.exibirInformacoes();
        }
    }




    public void simulador(int dias){


        for (int i = 0; i < dias; i++){

            Periodo periodo = Periodo.MANHÃ;
            for(int k = 0; k < 3; k++){
                System.out.println(periodo + ": ");

                int acontecimento = randomNumber(1, 4);

                switch (acontecimento){
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
                        catastrofeNatural();
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
        }
    }


    /**
     * Escolhe e executa uma ação aleatória para uma Planta
     */
    private void acontecimentoPlanta(){
        int indexPlanta = escolherPlanta();
        if (indexPlanta != -1){

            int acontecimento = randomNumber(1, 2);

            switch (acontecimento){
                case 1:
                    this.plantaAbanaComVento(indexPlanta);
                    break;
                case 2:
                    Planta planta = (Planta) this.seres.get(indexPlanta);

                    if (planta.getFamilia().equals(Familia.COME_INSETOS)){
                        this.plantaComeInseto(indexPlanta);
                    } else {
                        this.plantaBebe(indexPlanta);
                    }
                    break;
            }
        }
    }


    private void acontecimentoAnimal(){
        int indexAnimal = escolherAnimal();
        if (indexAnimal != -1){
            int acontecimento = randomNumber(1, 4);

            switch (acontecimento){
                case 1:
                    this.animalCome(indexAnimal);
                    break;
                case 2:
                    this.animalBebe(indexAnimal);
                    break;
                case 3:
                    this.animalMovimenta(indexAnimal);
                    break;
                case 4:
                    this.animalFazBarulho(indexAnimal);
                    break;
            }
        }

    }


    public void acontecimentoInseto(){
        int indexInseto = escolherInseto();
        if (indexInseto != -1){
            this.insetoChateia(indexInseto);
        }
    }

    public void catastrofeNatural(){
        switch (randomNumber(1, 3)){
            case 1:
                this.seca();
                break;
            case 2:
                this.chuva();
                break;
            case 3:
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
            int randomIndex = randomNumber(0, plantasIndexes.size()-1);
            return plantasIndexes.get(randomIndex);
        }
        return -1;
    }

    /**
     * Escolhe um Animal aleatório no Array de Seres Vivos
     * @return index correspondente a um Animal no Array de Seres Vivos ou -1, se nenhum Animal for encontrada
     */
    private int escolherAnimal(){
        ArrayList<Integer> animaisIndexes = getAnimaisIndexes();

        if (!animaisIndexes.isEmpty()){
            int randomIndex = randomNumber(0, animaisIndexes.size()-1);
            return animaisIndexes.get(randomIndex);
        }

        return -1;
    }


    /**
     * Escolhe um Inseto aleatório no Array de Seres Vivos
     * @return index correspondente a um Inseto no Array de Seres  ou -1, se nenhum Inseto for encontrada
     */
    private int escolherInseto(){
        ArrayList<Integer> insetosIndexes = new ArrayList<>();

        for (int i = 0; i < this.seres.size(); i++){
            if (this.seres.get(i) instanceof Inseto){
                insetosIndexes.add(i);
            }
        }

        if (!insetosIndexes.isEmpty()){
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
        } else {
            this.seres.remove(indexPlanta);
        }
    }

    /**
     * Remove um Inseto do Array de Seres Vivos, se houver.
     * Do contrário, remove a Planta.
     * @param indexPlanta index da Planta que deve se alimentar do inseto ou ser removida
     */
    private void plantaComeInseto(int indexPlanta){
        Planta planta = (Planta) this.seres.get(indexPlanta);

        if (planta.getFamilia().equals(Familia.COME_INSETOS)){
            int indexInseto = this.escolherInseto();
            if (indexInseto != -1){
                this.seres.remove(indexInseto);
            } else {
                this.seres.remove(indexPlanta);
            }
        }
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


    private void animalFazBarulho(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.print("** " + animal.getNome() + ":\n - ");
        animal.fazerBarulho();
    }

    private void animalMovimenta(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        System.out.print("** O animal " + animal.getNome() + " movimentou-se");
    }

    private void animalBebe(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        double consumoAnimal = animal.getConsumoAgua();

        if (this.agua >= consumoAnimal){
            this.agua -= consumoAnimal;
        } else {
            this.seres.remove(indexAnimal);
        }
    }

    private void animalCome(int indexAnimal){
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
                    // Se for noite e retorno false, animal morre.
                    animalComerPlanta(indexAnimal);
                case 2:
                    // Se for noite e retorno false, animal morre.
                    animalComerAnimal(indexAnimal);
                case 3:
                    animalComerInseto(indexAnimal);
            }
        }
    }

    private boolean animalComerAnimal(int indexAnimal){
        Animal animal = (Animal) this.seres.get(indexAnimal);
        if (getAnimaisIndexes().size() > 1){
            int indexAlimento;
            do{
                indexAlimento = escolherAnimal();
            } while (indexAnimal == indexAlimento);

            Animal alimento = (Animal) this.seres.get(indexAlimento);

            if (animal.getIndiceCapacidade() > alimento.getIndiceCapacidade()){
                this.seres.remove(indexAlimento);
                animal.setFome(false);
                return true;
            }
        }
        return false;
    }

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
                this.seres.remove(indexPlanta);
                animal.setFome(false);
                return true;
            }
        }
        return false;
    }

    public void animalComerInseto(int indexAnimal){
        int indexInseto = escolherInseto();

        if (indexInseto != -1){
            Inseto inseto = (Inseto) this.seres.get(indexInseto);

            if (inseto.isVenenoso()){
                this.seres.remove(indexAnimal);
            } else {
                this.seres.remove(indexInseto);
                Animal animal = (Animal) this.seres.get(indexAnimal);
                animal.setFome(false);
            }
        }
    }


    public void insetoChateia(int indexInseto){
        Inseto inseto = (Inseto) this.seres.get(indexInseto);
        inseto.zumbir(randomNumber(1, 3));
    }


    public void seca(){
        this.agua *= 0.5;
    }

    public void chuva(){
        this.agua *= 2;
    }

    public void erupcaoVulcanica(){
        this.eliminarMetadeDosSeres(this.getPlantasIndexes());
        this.eliminarMetadeDosSeres(this.getAnimaisIndexes());
    }

    public void eliminarMetadeDosSeres(ArrayList<Integer> seresIndexes){
        if (!seresIndexes.isEmpty()){
            if (seresIndexes.size() == 1){
                this.seres.remove(seresIndexes.get(0));
                return;
            }

            int qtdEliminar = seresIndexes.size() / 2 ;
            for (int i = 0; i < qtdEliminar; i++){
                this.seres.remove(seresIndexes.get(randomNumber(0, seresIndexes.size())-1));
            }
        }
    }


    private ArrayList<Integer> getPlantasIndexes(){
        ArrayList<Integer> plantasIndexes = new ArrayList<>();

        for (int i = 0; i < this.seres.size(); i++){
            if (this.seres.get(i) instanceof Planta){
                plantasIndexes.add(i);
            }
        }

        return plantasIndexes;

    }


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
        return rd.nextInt(min, max);
    }



}
