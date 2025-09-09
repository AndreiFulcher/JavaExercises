package Exercícios3;

public class CamaroteSuperior extends Vip{

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    @Override
    public Double valorVip() {
        return super.valorVip() + 50.0;
    }
}
