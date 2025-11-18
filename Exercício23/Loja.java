package Exercício23;

public class Loja {
    public static void main(String[] args) {

        Produto p = new Produto("Mouse Gamer", 20);

        try {
            System.out.println("Tentando vender...");
            p.vender(30);
            System.out.println("Venda Realizada com sucesso!");
        }catch(EstoqueInsuficienteException e){
            System.out.println("Erro ao vender: " + e.getMessage());
            System.out.println("Estoque disponível no momento do erro: " + e.getQtdEstoqueAtual());
        }
        System.out.println("Estoque final do produto: " + p.getQtdEstoque());
    }
}
