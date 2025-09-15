package Exercício9;

public class Veiculo {

    private String marca;
    private String modelo;
    private Double preco;

    public Veiculo(String marca, String modelo, Double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Double getPreco(){
        return preco;
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
    }
}
