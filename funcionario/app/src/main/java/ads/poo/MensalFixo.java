package ads.poo;

import java.io.Serializable;

public class MensalFixo extends Funcionario implements SalFixo {

    @Override
    public float calcSalario() {
        return 0;
    }

    @Override
    public float salFixo() {
        return 1600;
    }
}
