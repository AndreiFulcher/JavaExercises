package Exercício13;

public class ContaSalario extends ContaBancaria {

    private String empresaPermitida;

    public ContaSalario(String titular, double saldo, String empresaPermitida) {
        super(titular, saldo);
        this.empresaPermitida = empresaPermitida;
    }

    public void depositar(double valor, String empresa) {
        if (empresa.equals(empresaPermitida)) {
            setSaldo(getSaldo() + valor);
            System.out.printf("Depósito de R$ %.2f da empresa %s realizado para %s.%n", valor, empresa, getTitular());
        } else {
            System.out.printf("Depósito negado! Somente a empresa %s pode depositar.%n", empresaPermitida);
        }
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
}
