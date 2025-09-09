package Exercícios3;

public class Vip extends Ingresso{

    private Double valorAdicionalIng;

    public Vip(Double valorIng, Double valorAdicionalIng){
        super(valorIng);
        this.valorAdicionalIng = valorAdicionalIng;
    }

    public Double valorVip(){
        return getValorIng() + valorAdicionalIng;
    }

    public Double getValorAdicionalIng(){
        return valorAdicionalIng;
    }
}
