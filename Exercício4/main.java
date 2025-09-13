package Exercício4;

public class main {
    public static void main(String[] args) {

        System.out.println("\nImóvel Normal:");
        Imovel imovel = new Imovel("Rua das flores, 123", 200000.0);
        imovel.imprimeInfo();

        System.out.printf("=============================================\n");

        System.out.println("Imóvel Novo:");
        ImovelNovo imovelNovo = new ImovelNovo("Av. Central, 456",250000.0, 50000.0);
        imovelNovo.imprimeInfo();
        imovelNovo.imprimeAdicional();
        System.out.println("Preço final (Novo): R$" + imovelNovo.getPrecoFinal());

        System.out.printf("=============================================\n");

        System.out.println("Imóvel Velho:");
        ImovelVelho imovelVelho = new ImovelVelho("Rua das Hortênsias, 1234", 180000.0, 30000.0);
        imovelVelho.imprimeInfo();
        imovelVelho.imprimeDesconto();
        System.out.println("Preço final (Velho): R$" + imovelVelho.getPrecoFinal());

    }
}
