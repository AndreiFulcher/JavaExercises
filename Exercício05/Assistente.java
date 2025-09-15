package Exercício05;

public class Assistente extends Funcionario{

    private int nmrMatricula;

    public Assistente(){

    }

    public Assistente(String nome, String cpf, String rg, Double salario, int nmrMatricula){
        super(nome, cpf, rg, salario);
        this.nmrMatricula = nmrMatricula;
    }

    public int getNmrMatricula(){
        return nmrMatricula;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Matrícula: " + nmrMatricula);
    }
}
