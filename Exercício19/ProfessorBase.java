package Exercício19;

public abstract class ProfessorBase extends Pessoa implements Professor, Colaborador {

    protected String titulacao;

    public ProfessorBase(String nome, int cargaHoraria, String titulacao) {
        super(nome, cargaHoraria);
        this.titulacao = titulacao;
    }

    @Override
    public String obtemTitulacao() {
        return titulacao;
    }

    protected float adicional() {
        return switch (titulacao) {
            case "Mestrado" -> 1.2f;
            case "Doutorado" -> 1.5f;
            default -> 1.0f;
        };
    }

    @Override
    public int cargaHoraria() {
        return cargaHoraria;
    }
}


