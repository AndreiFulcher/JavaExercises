package Exercício16;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public boolean emprestar(){
        if(disponivel){
            disponivel = false;
            return true;
        } else {
            return false;
        }
    }

    public void devolver(){
        disponivel = true;
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacao: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("---------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
