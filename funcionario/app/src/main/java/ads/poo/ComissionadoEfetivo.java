package ads.poo;

import java.io.Serializable;

public class ComissionadoEfetivo extends Comissionado implements SalFixo {


    public ComissionadoEfetivo(String nome, String cargo, double percentualVenda, double valorVenda) {
        super(nome, cargo, percentualVenda, valorVenda);
    }

    @Override
    public float salFixo() {
        return 0;
    }

    @Override
    public float calcSalario() {
        return super.calcSalario();
    }

    public double calcComissao(double valorVendas) {
        return super.calcComissao(valorVendas);
    }
}
