package Exercício20;

public class Carro extends CondutorBase {

    public Carro(String nome, int potencia, String habilitacao) {
        super(nome, potencia, habilitacao);
    }

    @Override
    public float calcularCustoOperacional() {
        float base = potencia * VALOR_BASE * 2;
        return base * adicionalCategoria(habilitacao);
    }
}
