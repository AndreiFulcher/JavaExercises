package Exercício15;

public class Eletronico extends Produto{

    private int garantia;

    public Eletronico(String nome, double preco, int qtd, int garantia){
        super(nome, preco, qtd);
        this.garantia  = garantia;
    }

    @Override
    public String toString() {
        return String.format("Eletrônico: " + getNome() +
                ", Preço: R$ " + getPreco() +
                ", Quantidade: " + getQtd() +
                ", Garantia: " + garantia + " meses.\n");
    }
}
