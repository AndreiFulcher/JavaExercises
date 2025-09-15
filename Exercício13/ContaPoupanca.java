package Exercício13;

public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$ %.2f realizado para %s.%n", valor, getTitular());
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + juros);
        System.out.printf("Rendimento de R$ %.2f aplicado na conta de %s.%n", juros, getTitular());
    }
}
