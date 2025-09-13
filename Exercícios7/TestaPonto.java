package Exercícios7;

public class TestaPonto {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(2.0, 3.0);
        Ponto p3 = new Ponto(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p3.desloca(3.0, 0.0);
        System.out.println(p3);
    }

}
