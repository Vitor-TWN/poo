package ads.poo;

public class Circulo extends Forma{

    public Circulo(Cor corLinha, Cor corPreenchimento, int x, int y) {
        super(corLinha, corPreenchimento, x, y);
    }

    @Override
    public String desenhar() {
        return "Linha: posição (" + this.x + this.y + ") cor da linha (" + this.corLinha + ")"
                + " cor da linha (" + this.corPreenchimento + ")";
    }
}
