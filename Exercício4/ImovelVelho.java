package Exercício4;

public class ImovelVelho extends Imovel{

    private Double desconto;

    public ImovelVelho(String endereco, Double preco, Double desconto){
        super(endereco, preco);
        this.desconto = desconto;
    }

    public Double getDesconto(){
        return desconto;
    }

    public void imprimeDesconto(){
        System.out.println("Desconto (imóvel velho): R$" + desconto);
    }

    public Double getPrecoFinal(){
        return getPreco() - desconto;
    }
}
