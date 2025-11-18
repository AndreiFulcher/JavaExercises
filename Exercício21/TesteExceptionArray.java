package Exercício21;

public class TesteExceptionArray {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do método1");
        metodo2();
        System.out.println("fim do método1");
    }

    static void metodo2() {
        System.out.println("inicio do método2");
        int[] array = new int[10];

        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;  // Aqui ocorre o erro
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do limite do array!");
        }
        System.out.println("fim do método2");
    }
}

