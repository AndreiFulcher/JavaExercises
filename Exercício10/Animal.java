package Exercício10;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void emitirSom(){
        System.out.println("Som genérico de animal");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos");
    }
}
