package Ex05;

public class Agenda {

    private Pessoa[] pessoas;
    private int contPessoas = 0;

    /**
     * Adiciona uma pessoa à agenda
     * @param pessoa Pessoa a ser adicionada
     */
    public void adicionarPessoa(Pessoa pessoa){

        if(contPessoas == 0){
            this.pessoas = new Pessoa[1];
            this.pessoas[contPessoas] = pessoa;
            contPessoas++;

        } else {
            Pessoa[] novoArray = new Pessoa[contPessoas + 1];
            for (int i = 0; i < pessoas.length; i++){
                novoArray[i] = pessoas[i];
            }

            novoArray[contPessoas] = pessoa;
            contPessoas++;
            pessoas = novoArray;
        }
    }

    /**
     * Imprime registros da Agenda
     */
    public void imprimirAgenda(){
        System.out.println("\n ** AGENDA **");
        if (contPessoas == 0){
            System.out.println("Agenda vazia.");
        }else {
            for (int i = 0; i < this.contPessoas; i++){
                System.out.println("-- Contacto " + (i+1));
                this.pessoas[i].imprimirPessoa();
            }
        }
        System.out.println(" ** Fim ** \n");
    }


}
