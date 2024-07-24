package Seres;

import Seres.Enuns.Alimentacao;

public class Animal extends SerVivo{

    protected boolean fome;
    protected double peso;
    protected double inteligencia;
    protected Alimentacao dieta;
    protected String barulho;

    /**
     * Método para construir Animal
     * @param nome Nome do Animal
     * @param especie Espécie do Animal
     * @param pais País de Origem
     * @param idade Idade em anos
     * @param fome Boolean indicando se o Animal está com fome
     * @param peso Peso do Animal em kg
     * @param inteligencia Inteligencia do Animal entre 0 e 100
     * @param dieta Tipo de alimentação do Animal
     * @param barulho Barulho emitido pelo Animal
     */
    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, Alimentacao dieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;

        if (inteligencia < 0){
            this.inteligencia = 0;
        } else if (inteligencia > 100) {
            this.inteligencia = 100;
        } else {
            this.inteligencia = inteligencia;
        }

        this.dieta = dieta;
        this.barulho = barulho;
    }

    public boolean estaComFome() {
        return fome;
    }


    public Alimentacao getDieta() {
        return dieta;
    }

    /**
     * Calcula índice de capacidade do Animal
     * @return Valor do índice de capacidade do Animal
     */
    public double getIndiceCapacidade(){
        return this.peso + (2.5 * this.inteligencia);
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    /**
     * Exibe barulho emitido pelo animal
     */
    public void fazerBarulho(){
        System.out.println(this.barulho);
    }

    /**
     * Calcula consumo de água do animal baseado no seu peso
     * @return Quantidade de água que o Animal consome
     */
    public double getConsumoAgua(){
       return this.peso * 0.025;
    }

}
