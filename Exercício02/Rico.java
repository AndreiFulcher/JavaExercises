package Exercício02;

public class Rico extends Pessoa {

    private Double dinheiro;

    public void fazCompras() {
        System.out.println(getNome() + " está fazendo compras.");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }
}

