package Exercício18;

public class RestauranteTeste {
    public static void main(String[] args) {

        Prato p1 = new Prato("Lasanha", 35.0, 25);
        Prato p2 = new Prato("Pizza Margherita", 45.0, 20);
        Prato p3 = new Prato("Salada Caesar", 22.0, 10);

        Pedido pedido = new Pedido("João");

        System.out.println("=== Estado Inicial ===");
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();

        pedido.adicionarPrato(p1);
        pedido.adicionarPrato(p3);

        System.out.println("\n=== Pedido de João ===");
        pedido.exibirPedido();

        p1.aumentarPreco(5.0);
        p2.reduzirTempoPreparo(5);

        System.out.println("\n=== Após Alterações ===");
        p1.exibirInfo();
        p2.exibirInfo();

        pedido.adicionarPrato(p2);

        System.out.println("\n=== Pedido Final de João ===");
        pedido.exibirPedido();
    }
}
