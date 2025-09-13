package Exercício5;

public class Gerente extends Funcionario{

    public String nivelGerencia;

    public Gerente() {
    }

    public Gerente(String nome, String cpf, String rg, Double salario, String nivelGerencia) {
        super(nome, cpf, rg, salario);
        this.nivelGerencia = nivelGerencia;
    }

    @Override
    public void aplicarAumento(){
        salario += salario * 0.15;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Nível de Gerência: " + nivelGerencia);
    }
}
