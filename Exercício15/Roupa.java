package Exercício15;

public class Roupa extends Produto{

    private String tamanho;

    public Roupa(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return String.format("Roupa: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Quantidade: " + getQtd() +
                ", Tamanho: " + tamanho + ".\n");
    }
}
