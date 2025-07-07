package ads.poo;

public class Retangulo extends Forma{

    public Retangulo(Cor corLinha, Cor corPreenchimento, int x, int y) {
        super(corLinha, corPreenchimento, x, y);
    }

    @Override
    public String desenhar() {
        return "Linha: posição (" + this.x + this.y + ") cor da linha (" + this.corLinha + ")"
                + " cor do preenchimento (" + this.corPreenchimento + ")";
    }
}
