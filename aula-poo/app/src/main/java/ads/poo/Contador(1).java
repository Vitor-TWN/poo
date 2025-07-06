package ads.poo;

public class Contador {

    private int valorAtual;

    public void definirContador(int valor){
        valorAtual = valor;
    }
    public void incrementarContador(){
        valorAtual++;
    }
    public int obterValorAtual(){
        return valorAtual;
    }
}

