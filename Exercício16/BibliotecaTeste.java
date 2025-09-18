package Exercício16;

public class BibliotecaTeste {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true);
        Livro livro2 = new Livro("1984", "George Orwell", 1949, false);

        Usuario usuario = new Usuario("Maria");

        System.out.println("=== Estado Inicial ===");
        livro1.exibirInfo();
        livro2.exibirInfo();
        usuario.exibirInfo();

        usuario.pegarLivro(livro1);

        System.out.println("=== Após Empréstimo ===");
        livro1.exibirInfo();
        usuario.exibirInfo();

        usuario.pegarLivro(livro2);

        usuario.devolverLivro();

        System.out.println("=== Após Devolução ===");
        livro1.exibirInfo();
        usuario.exibirInfo();

    }
}
