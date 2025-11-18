package Exercício20;

public abstract class Motor {
    protected int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    protected float adicionalCategoria(String habilitacao) {
        return switch (habilitacao) {
            case "B" -> 1.10f;
            case "C" -> 1.20f;
            case "D" -> 1.30f;
            case "E" -> 1.40f;
            default -> 1.00f; // categoria A ou desconhecida
        };
    }
}

