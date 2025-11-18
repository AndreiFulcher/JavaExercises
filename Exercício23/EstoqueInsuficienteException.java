package Exercício23;

public class EstoqueInsuficienteException extends RuntimeException {

  private final int qtdEstoqueAtual;

  public EstoqueInsuficienteException(String message, int qtdEstoqueAtual) {
    super(message);
    this.qtdEstoqueAtual = qtdEstoqueAtual;
  }
  public int getQtdEstoqueAtual() {
    return qtdEstoqueAtual;
  }
}
