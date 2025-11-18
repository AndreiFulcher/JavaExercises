package Exercício24;

public class NotaInvalidaException extends RuntimeException {

  private double notaAtual;

  public NotaInvalidaException(String message, double notaAtual) {
      super(message);
      this.notaAtual= notaAtual;
    }

  public double getNotaAtual(){
    return notaAtual;
  }
}
