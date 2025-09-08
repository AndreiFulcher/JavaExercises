package Exercício2;

public class main {
    public static void main(String[] args) {

        Rico rico = new Rico();
        rico.setNome("Carla");
        rico.setIdade(30);
        rico.setDinheiro(10000.00);
        System.out.println("Rico:");
        System.out.println(rico.getNome() + " tem R$" + rico.getDinheiro());
        rico.fazCompras();

        System.out.println("-------------------------");

        Pobre pobre = new Pobre();
        pobre.setNome("João");
        pobre.setIdade(40);
        System.out.println("Pobre:");
        System.out.println(pobre.getNome() + " tem " + pobre.getIdade() + " anos.");
        pobre.trabalha();

        System.out.println("-------------------------");

        Miseravel miseravel = new Miseravel();
        miseravel.setNome("José");
        miseravel.setIdade(50);
        System.out.println("Miserável:");
        System.out.println(miseravel.getNome() + " tem " + miseravel.getIdade() + " anos.");
        miseravel.mendiga();
    }
}
