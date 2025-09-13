package Exercício7;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this(1.0, 1.0);
    }

    public Ponto(Ponto p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void setX(double xVal) {
        x = xVal;
    }

    public void setY(double yVal) {
        y = yVal;
    }

    public void desloca(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public double getX() {
        return (x);
    }

    public double getY() {
        return (y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

