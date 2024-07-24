package Ex04;

public class Imovel {

    private String rua;
    private String nPorta;
    private String cidade;
    private TipoDeImovel tipo;
    private AcabamentoImovel acabamento;
    private double area;
    private int nQuartos;
    private int nCasasDeBanho;
    private double areaPiscina;

    /**
     * Método para construir Imóvel
     *
     * @param rua           Rua onde se localiza o Imóvel
     * @param nPorta        Número da porta do Imóvel
     * @param cidade        Cidade onde se localiza o Imóvel
     * @param tipo          Tipo do Imóvel
     * @param acabamento    Situação do acabamento do Imóvel
     * @param area          Área do Imóvel em m2
     * @param nQuartos      Número de quartos que há no Imóvel
     * @param nCasasDeBanho Número de casas de banho que há no Imóvel
     * @param areaPiscina   Área da piscina em m2
     */
    public Imovel(String rua, String nPorta, String cidade, TipoDeImovel tipo, AcabamentoImovel acabamento, double area, int nQuartos, int nCasasDeBanho, double areaPiscina) {
        this.rua = rua;
        this.nPorta = nPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.nQuartos = nQuartos;
        this.nCasasDeBanho = nCasasDeBanho;
        this.areaPiscina = areaPiscina;
    }


    /**
     * Altera a situação do acabamento do Imóvel
     *
     * @param acabamento Novo Acabamento a ser atribuído
     */
    public void alterarAcamento(AcabamentoImovel acabamento) {
        this.acabamento = acabamento;
    }

    /**
     * Calcula valor de venda do Imóvel
     *
     * @return Valor de venda do Imóvel
     */
    public double calcularValor() {
        double valorTotal = 0;
        double valorm2 = 0;
        double margemAjuste = 0;

        switch (this.tipo) {
            case APARTAMENTO:
                valorm2 = 1000;
                break;
            case CASA:
                valorm2 = 3000;
                break;
            case MANSAO:
                valorm2 = 5000;
        }

        switch (this.acabamento) {
            case PARA_RESTAURO:
                margemAjuste = 0.5;
                break;
            case USADA:
                margemAjuste = 0.90;
                break;
            case NOVA:
                margemAjuste = 1;
            case NOVA_ALTO_ACABAMENTO:
                margemAjuste = 1.25;
        }

        double totalDevidoArea = this.area * valorm2;
        double incrQuartos = this.nQuartos * 7500;
        double incrCasaBan = this.nCasasDeBanho * 10500;
        double incrPiscina = this.areaPiscina * 1000;

        valorTotal += ((totalDevidoArea + incrQuartos + incrCasaBan + incrPiscina) * margemAjuste);
        return valorTotal;
    }

    /**
     * Imprime informações do Imóvel de forma organizada
     */
    public void imprimirDescricao() {
        System.out.println("\n ***** DETALHES DO IMÓVEL ****** ");
        System.out.println("Rua: " + this.rua);
        System.out.println("Número da porta: " + this.nPorta);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Acabamento: " + this.acabamento);
        System.out.println("Área: " + this.area + " m2");
        System.out.println("Quartos: " + this.nQuartos);
        System.out.println("Casas de Banho: " + this.nCasasDeBanho);
        System.out.println("Área da piscina: " + this.areaPiscina + " m2");
        System.out.println(" *********** \n");
    }

    /**
     * Compara o valor de venda dois imóveis
     * @param imovelAComparar Imóvel a ser comparado
     * @return Imóvel mais caro
     */
    public Imovel compararImoveis(Imovel imovelAComparar) {
        if (this.calcularValor() > imovelAComparar.calcularValor()) {
            return this;
        } else if (imovelAComparar.calcularValor() > this.calcularValor()) {
            return imovelAComparar;
        } else {
            return null;
        }
    }


}
