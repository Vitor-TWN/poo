package ads.poo;

public class Horista extends Funcionario implements SalFixo, HoraExtra {
    @Override
    public float calcSalario() {
        return 0;
    }

    @Override
    public double horaExtra(double totalHoraExtra) {
        return 9 + .5 * totalHoraExtra;
    }

    @Override
    public float salFixo() {
        return 1500;
    }
}
