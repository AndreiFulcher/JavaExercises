package Exercício21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExceptionMath {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");

        int x = 0;
        int y = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Informe o primeiro valor: ");
                x = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você deve digitar um número inteiro!");
                teclado.nextLine();
            }
        }

        valido = false;

        // (não pode ser zero)
        while (!valido) {
            try {
                System.out.print("Informe o segundo valor: ");
                y = teclado.nextInt();

                if (y == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida!");
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você deve digitar um número inteiro!");
                teclado.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        double r = (double) x / y;
        System.out.println("O resultado da divisão é " + r);
    }
}

