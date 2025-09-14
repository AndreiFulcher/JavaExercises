package Exercício8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {

    private String numeroOrigem;
    private String numeroDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.numeroOrigem = numeroOrigem;
        this.numeroDestino = numeroDestino;
    }

    public Ligacao(Contatos contatoOrigem, Contato contatoDestino){
        this.numeroOrigem = contatoDestino.getNumero();
        this.numeroDestino = contatoDestino.getNumero();
    }

    public void ligar(){
        System.out.println("Ligando para: " + numeroDestino);
        System.out.println("Chamando...");
        System.out.println("O número está ocupado");
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorData.format(horarioAgora);
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    @Override
    public String toString() {
        return String.format("Origem " + numeroOrigem + "\tDestino: " + numeroDestino +
                "\tHorário: " + horarioLigacao);
    }
}
