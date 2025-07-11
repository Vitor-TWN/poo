package ads.poo;

import java.util.Arrays;

public class Disciplina {
    private DiasDaSemana[] diasDaSemana;
    private String sigla;

    public Disciplina(String sigla, DiasDaSemana[] dias) {
        this.sigla = sigla;
        this.diasDaSemana = dias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disciplina{");
        sb.append("sigla='").append(sigla).append('\'');
        sb.append(", dias=").append(Arrays.toString(diasDaSemana));
        sb.append('}');
        return sb.toString();
    }
}
