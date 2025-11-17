package Exercício19;

public class ProfessorTecnico extends ProfessorBase{

    public ProfessorTecnico(String nome, int cargaHoraria, String titulacao) {
        super(nome, cargaHoraria, titulacao);
    }

    @Override
    public float obtemSalario() {
        return cargaHoraria * Colaborador.VALOR_BASE * 3 * adicional();
    }
}
