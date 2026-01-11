package Exercício25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // 3 PARTE
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Ana", "1111", 45));
        clientes.add(new Cliente(2, "Bruno", "2222", 30));
        clientes.add(new Cliente(3, "Carlos", "3333", 40));

        System.out.println("1- Lista de Clientes:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // 4 PARTE
        clientes.addFirst(new Cliente(4, "Andrei", "4444", 20));

        // 5 PARTE
        clientes.remove(2);

        // 6 PARTE
        System.out.println("\n2- Copia da lista Clientes:");
        ArrayList<Cliente> copiaClientes = new ArrayList<>(clientes);
        for (Cliente copia : clientes) {
            System.out.println(copia);
        }

        // 7 PARTE
        clientes.sort(Comparator.comparing(Cliente::getNome));

        System.out.println("\n3- Lista de Clientes Ordenados por nome:");
        for (Cliente clienteOrdenado : clientes) {
            System.out.println(clienteOrdenado);
        }

    }
}
