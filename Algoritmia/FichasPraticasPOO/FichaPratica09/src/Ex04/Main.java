package Ex04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua 1", "0C", "Cidade 1", TipoDeImovel.MANSAO, AcabamentoImovel.NOVA_ALTO_ACABAMENTO, 230, 15, 7, 8 );
        Imovel imovel2 = new Imovel("Rua 2", "2A", "Cidade 2", TipoDeImovel.APARTAMENTO, AcabamentoImovel.PARA_RESTAURO, 80, 3, 2, 0 );

        System.out.println("Descrição Imóvel 1");
        imovel1.imprimirDescricao();
        System.out.println();

        System.out.println("Descrição Imóvel 2");
        imovel2.imprimirDescricao();
        System.out.println();

        System.out.println("Mudar estado imóvel 2 para: NOVA");
        imovel2.alterarAcamento(AcabamentoImovel.NOVA);
        System.out.println();

        System.out.println("Descrição Imóvel 2");
        imovel2.imprimirDescricao();
        System.out.println();

        System.out.println("Valor imóvel 1: " + imovel1.calcularValor());
        System.out.println("Valor imóvel 2: " + imovel2.calcularValor());
        System.out.println();

        System.out.println("Imóvel mais caro: ");
        imovel1.compararImoveis(imovel2).imprimirDescricao();
    }
}
