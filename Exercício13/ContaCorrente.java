package Exercício13;

public class ContaCorrente extends ContaBancaria {

    private double limiteCheque;

    public ContaCorrente(String titular, double saldo, double limiteCheque) {
        super(titular, saldo);
        this.limiteCheque = limiteCheque;
    }

    public void limiteChequeEspecial(){
        System.out.println("O " + getTitular() + " tem um limite de cheque especial de R$" + limiteCheque + "!");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limiteCheque) {
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de R$ %.2f realizado para %s.%n", valor, getTitular());
        } else {
            System.out.printf("Saldo insuficiente! Limite do cheque especial: R$ %.2f.%n", limiteCheque);
        }
    }
}
