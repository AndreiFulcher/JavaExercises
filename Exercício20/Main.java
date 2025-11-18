package Exercício20;

public class Main {
    public static void main(String[] args) {


        Veiculo[] frota = new Veiculo[] {
                new Moto("João", 10, "A"),
                new Carro("Maria", 12, "B"),
                new Caminhao("Carlos", 15, "C"),
                new Caminhao("Roberto", 20, "E"),
                new Moto("Ana", 8, "A")
        };


        for (Veiculo v : frota) {
            String nome = "";
            String tipo = v.getClass().getSimpleName();
            String habilitacao = "";


            CondutorBase cb = (CondutorBase) v;
            nome = cb.getNome();
            habilitacao = cb.getHabilitacao();


            if (habilitacao.equals("C") || habilitacao.equals("D") || habilitacao.equals("E")) {
                nome += "*";
            }

            System.out.printf("%s - %s - Custo: R$ %.2f%n", nome, tipo, v.calcularCustoOperacional());
        }
    }
}
