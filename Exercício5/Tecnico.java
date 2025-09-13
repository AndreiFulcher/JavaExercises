package Exercício5;

public class Tecnico extends Assistente{

    private double bonusSalarial;

    public Tecnico(){

    }

    public Tecnico(String nome, String cpf, String rg, double salario, int nmrMatricula, double bonusSalarial) {
        super(nome, cpf, rg, salario, nmrMatricula);
        this.bonusSalarial = bonusSalarial;
        this.salario += bonusSalarial;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Bônus Salarial R$: " + bonusSalarial);
    }
}
