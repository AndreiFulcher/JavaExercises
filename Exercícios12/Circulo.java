package Exercícios12;

public class Circulo extends Forma{

    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Área do círculo: %.2f\n", calcularArea());
        System.out.printf("Perímetro do círculo: %.2f", calcularPerimetro());
    }
}
