package Exercício17;

public class Filme {

    private String titulo;
    private String diretor;
    private int anoLancamento;
    private boolean disponivel;

    public Filme(String titulo, String diretor, int anoLancamento, boolean disponivel){
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.disponivel = disponivel;
    }

    public boolean alugar(){
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

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("---------------------------");
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }
}
