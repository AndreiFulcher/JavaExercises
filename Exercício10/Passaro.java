package Exercício10;

public class Passaro extends Animal{

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando");
    }
}
