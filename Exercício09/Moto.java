package Exercício09;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String marca, String modelo, Double preco, int cilindrada){
        super(marca, modelo, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Quantidade de cilindradas da moto: " + cilindrada);
    }
}
