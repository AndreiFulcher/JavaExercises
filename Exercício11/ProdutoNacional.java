package Exercício11;

public class ProdutoNacional extends Produto {

    private Double descontoNacional;

    public ProdutoNacional(String nome, Double preco, int quantidade, Double descontoNacional) {
        super(nome, preco, quantidade);
        this.descontoNacional = descontoNacional;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Desconto de produto nacional: " + descontoNacional);
    }

    @Override
    public Double calcularPrecoFinal() {
        return getPreco() * getQuantidade() -  descontoNacional;
    }
}
