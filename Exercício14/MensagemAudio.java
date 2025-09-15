package Exercício14;

public class MensagemAudio extends Mensagem{

    public MensagemAudio(String texto){
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem áudio: " + getTexto());
    }
}
