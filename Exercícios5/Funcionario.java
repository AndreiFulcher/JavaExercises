package Exercícios5;

public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;
    protected Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public void aplicarAumento(){
        salario += salario * 0.10;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Salário: R$ " + salario);
    }
}
