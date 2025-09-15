package Exercício12;

public class Quadrado extends Forma{

    private Double lado;

    public Quadrado() {
        this.lado = 1.0;
    }

    public Quadrado(Double lado){
        this.lado = lado;
    }

    @Override
    public Double calcularArea(){
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro(){
        return lado * 4;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Área do quadrado: " + calcularArea());
        System.out.println("Perimitro do quadrado: " + calcularPerimetro());
    }
}
