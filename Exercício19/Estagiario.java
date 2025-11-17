package Exercício19;

public class Estagiario extends Pessoa implements Colaborador{

    public Estagiario(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public float obtemSalario() {
        return cargaHoraria * Colaborador.VALOR_BASE;
    }

    @Override
    public int cargaHoraria() {
        return cargaHoraria;
    }
}
