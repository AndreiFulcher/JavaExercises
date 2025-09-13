package Exercícios6;
import java.text.DecimalFormat;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int h, int m, int s) {
        this.acertaHora(h, m, s);
    }

    public Relogio(int h, int m) {
        this.acertaHora(h, m, 1);
    }

    public Relogio(int h) {
        this.acertaHora(h, 1, 1);
    }

    public void incrementa() {
        if (++this.segundo > 59) {
            this.segundo = 0;
            if (++this.minuto > 59) {
                this.minuto = 0;
                if (++this.hora > 23) {
                    this.hora = 0;
                }
            }
        }
    }

    public void decrementa() {
        if (--this.segundo < 0) {
            this.segundo = 59;
            if (--this.minuto < 0) {
                this.minuto = 59;
                if (--this.hora < 0) {
                    this.hora = 23;
                }
            }
        }
    }

    public void acertaHora(int h, int m, int s) {
        if (h >= 0 && h <= 23) {
            this.hora = h;
        } else {
            this.hora = 0;
        }

        if (m >= 0 && m <= 59) {
            this.minuto = m;
        } else {
            this.minuto = 0;
        }

        if (s >= 0 && s <= 59) {
            this.segundo = s;
        } else {
            this.segundo = 0;
        }

    }

    public String toString() {
        DecimalFormat numInt = new DecimalFormat("00");
        return "Hora atual: " + numInt.format((long) this.hora) + ":" + numInt.format((long) this.minuto) + ":" + numInt.format((long) this.segundo);
    }
}
