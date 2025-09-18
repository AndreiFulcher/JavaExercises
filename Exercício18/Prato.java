package Exercício18;

public class Prato {

    private String nome;
    private double preco;
    private int tempoPreparo;

    public Prato(String nome, double preco, int tempoPreparo) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
    }

    public void aumentarPreco(double valor){
        preco += valor;
    }

    public void reduzirTempoPreparo(int min){
        if(tempoPreparo - min >= 0){
            tempoPreparo -= min;
        } else {
            System.out.println("Tempo de preparo não pode ser negativo.");
        }
    }

    public void exibirInfo(){
        System.out.println("Nome do prato: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
        System.out.println("Tempo de preparo: " + tempoPreparo + " minutos");
    }

    public double getPreco() {
        return preco;
    }
}
