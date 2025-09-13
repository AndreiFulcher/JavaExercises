package Exercício3;

public class main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100.0);
        ingresso.imprimeValor();

        Vip vip = new Vip(100.0, 50.0);
        System.out.printf("Valor do VIP: " + vip.valorVip());

        Normal normal = new Normal(80.0);
        normal.imprimeValor();

        CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 50.0, "Setor A");
        System.out.println("Valor Camarote Inferior: R$" + camaroteInferior.valorVip() + ", no " + camaroteInferior.getLocalizacao() + ".");

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0);
        System.out.println("Valor Camarote Superior: R$" + camaroteSuperior.valorVip() + ", valor do vip + 50,0.");
    }
}
