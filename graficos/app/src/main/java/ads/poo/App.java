/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.lang.management.PlatformLoggingMXBean;
import java.sql.SQLOutput;

public class App {
    //criar ArrayList<Carta>
    //Faça um for aninhado com outro for para criar as 52 cartas
    //percirra a coleção invocando o toString de cada carta

    public static void main(String[] args) {

        Disciplina d = new Disciplina(
                "POO",
                new DiasDaSemana[]{DiasDaSemana.SEGUNDA, DiasDaSemana.QUINTA});

        System.out.println(d);


        for (DiasDaSemana a : DiasDaSemana.values()){
            System.out.println(d);
        }

        DiasDaSemana e = DiasDaSemana.TERCA;

        switch (e) {
            case SEGUNDA -> System.out.println("tem aula");
            case TERCA -> System.out.println("Não tem aula");
            case QUINTA -> System.out.println("tem aula");
        }

        System.out.println(e);

        PlanetasSistema p = PlanetasSistema.JUPITER;


    }
}
