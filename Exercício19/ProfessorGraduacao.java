package Exercício19;

public class ProfessorGraduacao extends ProfessorBase{

    public ProfessorGraduacao(String nome, int cargaHoraria, String titulacao) {
        super(nome, cargaHoraria, titulacao);
    }

    @Override
    public float obtemSalario() {
        return cargaHoraria * Colaborador.VALOR_BASE * 4 * adicional();
    }
}
