package Exercício24;

public class Aluno {

    private String nome;
    private double nota;

    public Aluno(){
    }

    public void setNota(double nota) {
        if(nota < 0 || nota > 10){
            throw new NotaInvalidaException("Nota inválida! Deve ser entre 0 e 10.", nota);
        }
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
