package Exercício8;

public class Main {
    public static void main(String[] args) {

        Telefone telefone = new Telefone("4002 8922");
        Contato contatoA = new Contato("Andrei", "4089545");
        Contato contatoB = new Contato("Luan", "4045564");
        Contato contatoC = new Contato("Lara", "40589335");
        Contato contatoD = new Contato("Carlos", "40469332");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        System.out.println(telefoneContatos);

        System.out.println("Contatos Filtrados:");
        System.out.println(telefoneContatos.buscar("a"));

        telefone.ligar(contatoA);
        telefone.ligar(contatoB);
        System.out.println(telefone.getChamadas());
    }
}
