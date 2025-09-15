package Exercício12;

public class Retangulo extends Forma{

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (altura + base);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Área do retângulo: " + calcularArea());
        System.out.println("Perímetro do retângulo: " + calcularPerimetro());
    }
}
