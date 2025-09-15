package Exercício11;

public class ProdutoImportado extends Produto {

    private Double taxaImportacao;

    public ProdutoImportado(String nome, Double preco, int quantidade, Double taxaImportacao) {
        super(nome, preco, quantidade);
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Taxa de produto importado: " + taxaImportacao);
    }

    @Override
    public Double calcularPrecoFinal() {
        return getPreco() * getQuantidade() +  taxaImportacao;
    }
}
