package Exercício23;

public class Produto {

    private final String nome;
    private int qtdEstoque;

    public Produto(String nome, int qtdEstoque) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
    }

    public void vender(int qtd) throws EstoqueInsuficienteException{
        if(qtd > qtdEstoque){
            throw new EstoqueInsuficienteException("Quantidade solicitada (" + qtd + ") maior que o estoque disponível!", qtdEstoque);
        }
        qtdEstoque -= qtd;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }
}
