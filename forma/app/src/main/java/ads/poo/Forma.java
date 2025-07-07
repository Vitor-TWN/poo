package ads.poo;

public abstract class Forma {
    public int x;
    public int y;
    public Cor corLinha;
    public Cor corPreenchimento;



    public Forma(Cor corLinha, Cor corPreenchimento, int x, int y) {
        this.corLinha = corLinha;
        this.corPreenchimento = corPreenchimento;
        this.x = x;
        this.y = y;
    }

    public abstract String desenhar();

}
