package Exercícios4;

public class ImovelNovo extends Imovel{

    private Double adicionalNovo;

    public ImovelNovo(){

    }

    public ImovelNovo(String endereco, Double preco, Double adicionalNovo){
        super(endereco, preco);
        this.adicionalNovo = adicionalNovo;
    }

    public Double getAdicionalNovo(){
        return adicionalNovo;
    }

    public void imprimeAdicional(){
        System.out.println("Adicional (imóvel novo): R$" + adicionalNovo);
    }

    public Double getPrecoFinal() {
        return getPreco() + adicionalNovo;
    }
}
