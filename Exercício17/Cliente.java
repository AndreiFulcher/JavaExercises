package Exercício17;

public class Cliente {

    private String nome;
    private Filme filmeAlugado;

    public Cliente(String nome){
        this.nome = nome;
        this.filmeAlugado = null;
    }

    public void alugarFilme(Filme f){
        if(filmeAlugado != null){
            System.out.println(nome + " já tem um filme alugado.");
        } else if (f.alugar()){
            filmeAlugado = f;
            System.out.println(nome + " alugou o filme " + f.getTitulo());
        } else {
            System.out.println("O filme " + f.getTitulo() + " não está disponível.");
        }
    }

    public void devolverFilme(){
        if(filmeAlugado != null){
            filmeAlugado.devolver();
            System.out.println(nome + " devolveu o filme " + filmeAlugado.getTitulo());
            filmeAlugado = null;
        } else {
            System.out.println(nome + " não possui filme para devolver!");
        }
    }

    public void exibirInfo(){
        System.out.println("Usuário: " + nome);
        if (filmeAlugado != null) {
            System.out.println("Filme emprestado: " + filmeAlugado.getTitulo());
        } else {
            System.out.println("Nenhum filme emprestado.");
        }
        System.out.println("---------------------------");
    }

}


