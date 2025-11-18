package Exercício24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        a.setNome(nome);

        boolean notaValida = false;

        while (!notaValida){
            try{
                System.out.println("Digite a nota do aluno (0 a 10):");
                double nota = sc.nextDouble();
                a.setNota(nota);
                notaValida = true;
            }catch (InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número!");
                sc.nextLine();
            } catch (NotaInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Nota digitada: " + e.getNotaAtual());
            }
        }

        System.out.println("Nota cadastrada com sucesso!");
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Nota final: " + a.getNota());
    }
}
