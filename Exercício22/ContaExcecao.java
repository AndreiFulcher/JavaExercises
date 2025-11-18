package Exercício22;

public class ContaExcecao extends Exception {

    private final double saldoAtual;

    public ContaExcecao(String mensagem, double saldoAtual) {
        super(mensagem);
        this.saldoAtual = saldoAtual;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }
}

