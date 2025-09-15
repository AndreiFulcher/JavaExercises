package Exercício09;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Toyota", "Corolla", 120000.0, 4);
        Veiculo moto = new Moto("Honda", "CB 500", 35000.0, 500);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 450000.0, 2000.0);

        System.out.println("=== Informações dos veículos ===");
        carro.exibirInfo();
        System.out.println();

        moto.exibirInfo();
        System.out.println();

        caminhao.exibirInfo();

    }
}
