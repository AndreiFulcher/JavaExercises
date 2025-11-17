package Exercício19;

public class Funcionario extends Pessoa implements Colaborador{

    public Funcionario(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public float obtemSalario() {
        return cargaHoraria * Colaborador.VALOR_BASE * 2;
    }

    @Override
    public int cargaHoraria() {
        return cargaHoraria;
    }
}
