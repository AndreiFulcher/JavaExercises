package Exercício22;

public class Caixa {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.deposita(900);
        minhaConta.setLimite(100);

        try {
            minhaConta.saca(1000);
        } catch (ContaExcecao e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
            System.out.println("Saldo no momento do erro: R$ " + e.getSaldoAtual());
        }

        System.out.println("Saldo final: R$ " + minhaConta.getSaldo());
    }
}

