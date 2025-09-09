package Exercícios5;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("João", "123.456.789-00", "MG-12.345.678", 2000.0);
        Gerente g = new Gerente("Maria", "987.654.321-00", "SP-87.654.321", 5000.0, "Alta");

        System.out.println("Antes do aumento:\n");
        f.exibeDados();
        System.out.println();
        g.exibeDados();

        f.aplicarAumento();
        g.aplicarAumento();

        System.out.println("===============================================");

        System.out.println("Depois do aumento:\n");
        f.exibeDados();
        System.out.println();
        g.exibeDados();
    }
}
