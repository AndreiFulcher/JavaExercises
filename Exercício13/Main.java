package Exercício13;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Andrei", 5000.0, 1000.0);
        ContaPoupanca cp = new ContaPoupanca("Ana", 4000.0, 0.05);
        ContaSalario cs = new ContaSalario("Pedro", 3000.0, "Randon");

        System.out.println("\n=== Conta Corrente ===");
        System.out.printf("Saldo inicial de %s: R$ %.2f.%n", cc.getTitular(), cc.getSaldo());
        cc.depositar(500.0);
        cc.sacar(1800.0);
        cc.limiteChequeEspecial();
        System.out.printf("Saldo final: R$ %.2f.%n", cc.getSaldo());

        System.out.println("\n=== Conta Poupança ===");
        System.out.printf("Saldo inicial de %s: R$ %.2f.%n", cp.getTitular(), cp.getSaldo());
        cp.depositar(300.0);
        cp.renderJuros();
        cp.sacar(500.0);
        System.out.printf("Saldo final: R$ %.2f.%n", cp.getSaldo());

        System.out.println("\n=== Conta Salário ===");
        System.out.printf("Saldo inicial de %s: R$ %.2f.%n", cs.getTitular(), cs.getSaldo());
        cs.depositar(1000.0, "Randon");
        cs.depositar(500.0, "EmpresaY");
        cs.sacar(200.0);
        System.out.printf("Saldo final: R$ %.2f.%n", cs.getSaldo());
    }
}
