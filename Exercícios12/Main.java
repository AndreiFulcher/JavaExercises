package Exercícios12;

public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5.0);
        Retangulo r = new Retangulo(5.0, 5.0);
        Circulo c = new Circulo(5.0);

        System.out.println("=== Quadrado ===");
        q.exibirInfo();

        System.out.println("\n=== Retângulo ===");
        r.exibirInfo();

        System.out.println("\n=== Círculo ===");
        c.exibirInfo();
    }
}
