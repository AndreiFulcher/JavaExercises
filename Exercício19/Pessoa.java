package Exercício19;

public abstract class Pessoa {

    protected String nome;
    protected int cargaHoraria;

    public Pessoa(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome(){
        return nome;
    }
}
