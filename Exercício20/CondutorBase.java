package Exercício20;

public abstract class CondutorBase extends Motor implements Veiculo, Condutor {
    protected String nome;
    protected String habilitacao;


    public CondutorBase(String nome, int potencia, String habilitacao) {
        super(potencia);
        this.nome = nome;
        this.habilitacao = habilitacao;
    }


    public String getNome() {
        return nome;
    }


    @Override
    public String getHabilitacao() {
        return habilitacao;
    }
}

