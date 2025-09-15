package Exercício14;

public abstract class Mensagem {

    private String texto;

    public Mensagem(String texto){
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public abstract void enviar();
}
