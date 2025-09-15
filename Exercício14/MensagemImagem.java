package Exercício14;

public class MensagemImagem extends Mensagem{

    public MensagemImagem(String texto){
        super(texto);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem imagem: " + getTexto());
    }
}
