package Exercício08;

import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos(){
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato){
        contatos.add(novoContato);
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public Contatos buscar(String palavraChave) {
        Contatos contatosFiltrados = new Contatos();
        String chave = palavraChave.toLowerCase();
        for (Contato contato : contatos) {
            String nomeContato = contato.getNome().toLowerCase();
            if (nomeContato.startsWith(chave)) {
                contatosFiltrados.adicionar(contato);
            }
        }
        return contatosFiltrados;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contatos:\n");
        for (Contato contato : contatos) {
            sb.append(contato).append("\n");
        }
        return sb.toString();
    }

}
