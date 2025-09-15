package Exercício05;

public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Funcionario f = new Funcionario("João", "111.222.333-44", "1234567", 2000.0);
        Gerente g = new Gerente("Maria", "555.666.777-88", "7654321", 5000.0, "Alto");
        Assistente a = new Assistente("Pedro", "999.888.777-66", "4561237", 1800.0, 101);
        Tecnico t = new Tecnico("Carlos", "123.456.789-00", "9876543", 2200, 102, 500);
        Administrativo adDia = new Administrativo("Laura", "147.258.369-11", "7894561", 1900, 103, "dia", 300);
        Administrativo adNoite = new Administrativo("Ana", "321.654.987-00", "6549871", 1900, 104, "noite", 300);

        // Testando Funcionário
        System.out.println("=== Funcionário ===");
        f.exibeDados();
        f.aplicarAumento();
        System.out.println("Após aumento (10%):");
        f.exibeDados();

        // Testando Gerente
        System.out.println("\n=== Gerente ===");
        g.exibeDados();
        g.aplicarAumento();
        System.out.println("Após aumento (15%):");
        g.exibeDados();

        // Testando Assistente
        System.out.println("\n=== Assistente ===");
        a.exibeDados();
        a.aplicarAumento();
        System.out.println("Após aumento (10%):");
        a.exibeDados();

        // Testando Técnico
        System.out.println("\n=== Técnico ===");
        t.exibeDados();
        t.aplicarAumento();
        System.out.println("Após aumento (10%):");
        t.exibeDados();

        // Testando Administrativo - turno dia
        System.out.println("\n=== Administrativo (Turno Dia) ===");
        adDia.exibeDados();
        adDia.aplicarAumento();
        System.out.println("Após aumento (10%):");
        adDia.exibeDados();

        // Testando Administrativo - turno noite
        System.out.println("\n=== Administrativo (Turno Noite) ===");
        adNoite.exibeDados();
        adNoite.aplicarAumento();
        System.out.println("Após aumento (10%):");
        adNoite.exibeDados();
    }
}
