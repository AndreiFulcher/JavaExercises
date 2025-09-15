package Exercício11;

public class ProdutoDigital extends Produto {

    private Double tempoDowload;

    public ProdutoDigital(String nome, Double preco, int quantidade, Double tempoDowload) {
        super(nome, preco, quantidade);
        this.tempoDowload = tempoDowload;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tempo de download de " + tempoDowload + "MB/s");
    }
}
