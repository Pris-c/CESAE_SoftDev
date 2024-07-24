package Seres;

public class Inseto extends SerVivo{

    protected boolean venenoso;

    /**
     * Método para construir Inseto
     * @param nome Nome do Inseto
     * @param especie Especie do Inseto
     * @param pais País de Origem
     * @param idade Idade em anos
     * @param venenoso Boolean indicando se o Inseto é venenoso
     */
    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }


    public boolean isVenenoso() {
        return venenoso;
    }

    /**
     * O Inseto exibe um zumbido entre 3 tipos
     * @param zumbido indentificação do zumbido a ser exibido
     */
    public void zumbir(int zumbido){
        System.out.print(this.nome + ": ");
        switch (zumbido){
            case 1:
                System.out.println("Bzzzzz bzzzz");
                break;
            case 2:
                System.out.println("Tic tic tic tic");
                break;
            case 3:
                System.out.println("Pssssss");
                break;
        }
    }
}
