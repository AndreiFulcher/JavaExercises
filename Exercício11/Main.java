package Exercício11;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto Genérico", 100.0, 5);
        ProdutoImportado p2 = new ProdutoImportado("Produto Importado", 200.0, 10, 200.0);
        ProdutoNacional p3 = new ProdutoNacional("Produto Nacional", 150.0, 20, 200.0);
        ProdutoDigital p4 = new ProdutoDigital("E-book", 50.0, 10, 5.0);

        Produto[] produtos = {p1, p2, p3, p4};

        for (Produto p : produtos) {
            p.exibirInfo();
            System.out.println();
        }
    }
}
