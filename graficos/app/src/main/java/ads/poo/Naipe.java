package ads.poo;

public enum Naipe {

    PAUS("Paus"),
    OUROS("Ouros"),
    COPAS("Copas"),
    ESPADAS("Espadas");

    private String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return this.naipe;
    }
}
