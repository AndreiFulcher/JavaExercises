package Exercício03;

public class Ingresso {

    private Double valorIng;

    public Ingresso(){

    }

    public Ingresso(Double valor) {
        this.valorIng = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$" + valorIng);
    }

    public Double getValorIng() {
        return valorIng;
    }
}
