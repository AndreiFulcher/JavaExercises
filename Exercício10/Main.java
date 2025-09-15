package Exercício10;

public class Main {
    public static void main(String[] args){

        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Negresco", 2);
        Animal passaro = new Passaro("Piupiu", 7);

        System.out.println("=== Informações dos Animais ===");
        cachorro.exibirInfo();
        cachorro.emitirSom();
        System.out.println();

        gato.exibirInfo();
        gato.emitirSom();
        System.out.println();

        passaro.exibirInfo();
        passaro.emitirSom();
    }
}
