package Exercício01;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Lili");
        cachorro.setRaca("SRD");
        System.out.printf("Cachorro:\n");
        System.out.println(cachorro.getNome() + " é da raça " + cachorro.getRaca());
        cachorro.caminha();
        cachorro.late();

        System.out.println("-------------------------");

        Gato gato = new Gato();
        gato.setNome("Negresco");
        gato.setRaca("SRD");
        System.out.printf("Gato:\n");
        System.out.println(gato.getNome() + " é da raça " + gato.getRaca());
        gato.caminha();
        gato.mia();
    }
}
