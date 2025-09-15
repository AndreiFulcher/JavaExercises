package Exercício08;

import java.util.ArrayList;

public class Chamadas {

    private ArrayList<Ligacao> chamadas;

    public Chamadas(){
        this.chamadas = new ArrayList<>();
    }

    public void adicionar(Ligacao ligacao){
        this.chamadas.add(ligacao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Chamadas:\n");
        for (Ligacao chamada : chamadas) {
            sb.append(chamada).append("\n");
        }
        return sb.toString();
    }

}
