package Exercício5;

public class Administrativo extends Assistente{

    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, String cpf, String rg, double salario, int nmrMatricula, String turno, double adicionalNoturno){
        super(nome, cpf, rg, salario, nmrMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
        if (turno.equalsIgnoreCase("noite")) {
            this.salario += adicionalNoturno;
        }
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if(turno.equalsIgnoreCase("noite")){
            System.out.println("Adicional noturno: R$" + adicionalNoturno);
        }
    }
}
