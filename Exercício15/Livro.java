package Exercício15;

public class Livro extends Produto{

    private int numeroPaginas;

    public Livro(String nome, double preco, int quantidade, int numeroPaginas){
        super(nome, preco, quantidade);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString(){
        return String.format("Livro: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Quantidade: " + getQtd() +
                ", Páginas: " + numeroPaginas + ".\n");
    }
}
