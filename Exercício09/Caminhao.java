package Exercício09;

public class Caminhao extends Veiculo{

    private Double capacidadeCarga;

    public Caminhao(String marca, String modelo, Double preco, Double capacidadeCarga){
        super(marca, modelo, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public Double valorDoFrete(){
        return capacidadeCarga * 100.0;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Valor do Frete: R$" + valorDoFrete());
    }
}
