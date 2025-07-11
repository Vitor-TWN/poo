package ads.poo;

public enum PlanetasSistema {


    MERCÚRIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private int posicao;

    PlanetasSistema(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "" + this.posicao;
    }
}
