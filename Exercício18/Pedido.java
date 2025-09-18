package Exercício18;

import java.util.ArrayList;

public class Pedido {

    private String cliente;
    private ArrayList<Prato> pratos;

    public Pedido(String cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public Double calcularTotal(){
        double total = 0.0;
        for(Prato prato : pratos){
            total += prato.getPreco();
        }
        return total;
    }

    public void exibirPedido(){
        System.out.println("Pedido do cliente: " + cliente);
        System.out.println("Pratos no pedido:");
        for(Prato prato : pratos){
            prato.exibirInfo();
            System.out.println("-------------------");
        }
        System.out.println("Total do pedido: R$" + String.format("%.2f", calcularTotal()));
    }
}
