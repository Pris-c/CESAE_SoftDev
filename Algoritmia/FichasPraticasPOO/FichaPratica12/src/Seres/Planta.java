package Seres;

import Seres.Enuns.Familia;

public class Planta extends SerVivo{

    protected Familia familia;
    protected int grauDefesa;

    /**
     * Método para construir Planta
     * @param nome Nome da Planta
     * @param especie Espécie da Planta
     * @param pais País de origem
     * @param idade Idade em anos
     * @param familia Familia da Planta
     * @param grauDefesa Grau de Defesa entre 0 e 5.
     */
    public Planta(String nome, String especie, String pais, int idade, Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familia = familia;

        if (grauDefesa < 0){
            this.grauDefesa = 0;
        } else if (grauDefesa > 5){
            this.grauDefesa = 5;
        } else {
            this.grauDefesa = grauDefesa;
        }
    }

    public Familia getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }

    public double getConsumoAgua(){
        switch (this.familia){
            case AVORES: return 1;
            case FLORES: return 0.1;
            case ERVAS: return 0.25;
            default: return 0;
        }
    }




}
