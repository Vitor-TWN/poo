package ads.poo;

public class Cor {
    public int blue;
    public int green;
    public int red;

    public Cor(int red, int green, int blue) {
        this.blue = validarCor(blue);
        this.green = validarCor(green);
        this.red = validarCor(red);
    }

    private int validarCor(int valor) {
        if (valor < 0) return 0;
        if (valor > 255) return 255;
        return valor;
    }


    @Override
    public String toString() {
        return "(" + red + "," + green + "," + blue + ")";
    }
}
