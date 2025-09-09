package Exercícios3;

public class Normal extends Ingresso{

    public Normal(Double valorIng) {
        super(valorIng);
    }

    @Override
    public void imprimeValor() {
        System.out.println("\nValor do ingresso Normal: R$" + getValorIng());
    }
}
