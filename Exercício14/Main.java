package Exercício14;

public class Main {
    public static void main(String[] args) {
        MensagemTexto mt = new MensagemTexto("Testando mensagem!");
        MensagemAudio ma = new MensagemAudio("Gravação de áudio");
        MensagemImagem mi = new MensagemImagem("Foto de comida");

        System.out.println("===TEXTO===");
        mt.enviar();
        System.out.println();

        System.out.println("===Áudio===");
        ma.enviar();
        System.out.println();

        System.out.println("===IMAGEM===");
        mi.enviar();
        System.out.println();
    }
}
