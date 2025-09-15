package Exercício09;

public class Carro extends Veiculo{

    private int qtdDePortas;

    public Carro(String marca, String modelo, Double preco, int qtdDePortas){
        super(marca, modelo, preco);
        this.qtdDePortas = qtdDePortas;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Quantidade de portas do carro: " + qtdDePortas);
    }

}
