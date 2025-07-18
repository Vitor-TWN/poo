package ads.poo;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Pilha<T> {
    private T [] dados;


    public Pilha(T dados) {
        this.dados = new T [tamanho];
    }

    public void empilhar(T e) {
       this.dados.add(e);
    }

    public T desempilhar(T e) {
        this.dados.remove(e);
        return e;
    }

    public T obterTopo() {
        this.dados;
    }


}
