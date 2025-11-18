package Exercício22;

public class Conta {

    private double saldo;
    private double limite;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void saca(double valor) throws ContaExcecao {
        if (valor > saldo + limite) {
            throw new ContaExcecao(
                    "Saldo insuficiente para sacar R$ " + valor,
                    this.saldo
            );
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

