package Exercício16;

public class Usuario {

    private String nome;
    private Livro livroEmprestado;

    public Usuario(String nome){
        this.nome = nome;
        this.livroEmprestado = null;
    }

    public void pegarLivro(Livro livro){
        if(livroEmprestado != null){
            System.out.println(nome + " já possui um livro emprestado!");
        } else if (livro.emprestar()){
            livroEmprestado = livro;
            System.out.println(nome + " pegou emprestado o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível.");
        }
    }

    public void devolverLivro(){
        if(livroEmprestado != null){
            livroEmprestado.devolver();
            System.out.println(nome + " devolveu o livro:  " + livroEmprestado.getTitulo());
            livroEmprestado = null;
        } else {
            System.out.println(nome + " não possui livro para devolver!");
        }
    }

    public void exibirInfo(){
        System.out.println("Usuário: " + nome);
        if (livroEmprestado != null) {
            System.out.println("Livro emprestado: " + livroEmprestado.getTitulo());
        } else {
            System.out.println("Nenhum livro emprestado.");
        }
        System.out.println("---------------------------");
    }
}
