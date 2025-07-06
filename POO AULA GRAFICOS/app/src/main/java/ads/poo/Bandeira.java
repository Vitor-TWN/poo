package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Bandeira {
    private double x;
    private double y;
    private double escala;

    public Bandeira(double x, double y, double escala) {
        this.x = x;
        this.y = y;
        this.escala = escala;
    }

    public void desenhar(Draw draw){
        draw.rectangle(x, y, .1*escala, .1*escala);
        draw.setPenColor(255,0,0);
        draw.filledCircle(.5,.5,.05*escala);
    }

}
