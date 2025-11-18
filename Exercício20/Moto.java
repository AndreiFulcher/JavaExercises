package Exercício20;

public class Moto extends CondutorBase {
    public Moto(String nome, int potencia, String habilitacao) {
        super(nome, potencia, habilitacao);
    }


    @Override
    public float calcularCustoOperacional() {
        float base = potencia * VALOR_BASE * 1;
        return base * adicionalCategoria(habilitacao);
    }
}

