package Exercício13;

public abstract class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado para %s.%n", valor, titular);
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
