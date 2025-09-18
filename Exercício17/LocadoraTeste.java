package Exercício17;

public class LocadoraTeste {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Matrix", "Lana e Lilly Wachowski", 1999, true);
        Filme filme2 = new Filme("O Poderoso Chefão", "Francis Ford Coppola", 1972, false);

        Cliente cliente = new Cliente("João");

        System.out.println("=== Estado Inicial ===");
        filme1.exibirInfo();
        filme2.exibirInfo();
        cliente.exibirInfo();

        cliente.alugarFilme(filme1);

        System.out.println("=== Após Aluguel ===");
        filme1.exibirInfo();
        cliente.exibirInfo();

        cliente.alugarFilme(filme2);

        cliente.devolverFilme();

        System.out.println("=== Após Devolução ===");
        filme1.exibirInfo();
        cliente.exibirInfo();
    }
}
