package ads.poo;

import java.io.Serializable;

public class Comissionado extends Funcionario {

    private double percentualVenda;
    private double valorVneda;

    public Comissionado(String nome, String cargo, double percentualVenda, double valorVenda) {
        this.nome = nome;
        this.cargo = cargo;
        this.percentualVenda = percentualVenda;
        this.valorVneda = valorVenda;
    }



    @Override
    public float calcSalario() {
        return (float) (percentualVenda + valorVneda);
    }

    public double calcComissao(double valorVenda) {
        return (valorVenda * .5 );
    }
}
