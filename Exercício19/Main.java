package Exercício19;

public class Main {
    public static void main(String[] args) {

        Colaborador[] lista = new Colaborador[] {
                new Estagiario("Ana", 20),
                new Funcionario("Carlos", 40),
                new ProfessorTecnico("Marcos", 30, "Graduacao"),
                new ProfessorGraduacao("Julia", 40, "Mestrado"),
                new ProfessorGraduacao("Renata", 40, "Doutorado")
        };

        for (Colaborador c : lista) {
            String nome = "";
            boolean ehProfessor = c instanceof Professor;

            nome = ((Pessoa) c).getNome();

            if (ehProfessor) nome += "*";

            System.out.printf("%s - Salário: R$ %.2f%n", nome, c.obtemSalario());
        }
    }
}

