package Exercício14;

public class MensagemTexto extends Mensagem{

    public MensagemTexto(String texto){
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem texto: " + getTexto());
    }
}
