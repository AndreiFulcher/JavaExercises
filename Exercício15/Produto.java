package Exercício15;

public abstract class Produto {

    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void adicionarEstoque(int qtd){
        this.qtd += qtd;
    }

    public void removerEstoque(int qtd){
        if(qtd <= this.qtd){
            this.qtd -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque!");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public abstract String toString();
}
