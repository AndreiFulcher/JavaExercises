package Exercício15;

public class Main {
    public static void main(String[] args) {

        Eletronico e = new Eletronico("Notebook", 3500.0, 10, 24);
        Roupa r = new Roupa("Camiseta", 80.0, 50, "M");
        Livro l = new Livro("Code Java", 120.0, 20, 450);

        System.out.println("=== Estoque Inicial ===");
        System.out.println(e);
        System.out.println(r);
        System.out.println(l);

        System.out.println("\n=== Alterações no Estoque ===");

        e.adicionarEstoque(5);
        System.out.println("Após adicionar notebooks: " + e);

        r.removerEstoque(10);
        System.out.println("Após vender camisetas: " + r);

        l.adicionarEstoque(15);
        l.removerEstoque(5);
        System.out.println("Após movimentação de livros: " + l);

        System.out.println("\n=== Estoque Final ===");
        System.out.println(e);
        System.out.println(r);
        System.out.println(l);
    }
}
