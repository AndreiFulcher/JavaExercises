package Exercício11;

public class Produto {

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preco final: R$" + calcularPrecoFinal());
    }

    public Double calcularPrecoFinal() {
        return preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
