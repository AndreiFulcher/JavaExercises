package Exercício20;

public class Caminhao extends CondutorBase {

    public Caminhao(String nome, int potencia, String habilitacao) {
        super(nome, potencia, habilitacao);
    }

    @Override
    public float calcularCustoOperacional() {
        float base = potencia * VALOR_BASE * 4;
        return base * adicionalCategoria(habilitacao);
    }
}