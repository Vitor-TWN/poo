package ads.poo;

public class Personagem {
    private String classe;
    private double dano;
    private double altura;
    private double defesa;
    private int energiaMagia;
    private int velocidade;
    private int vida;

    public void classePersonagem(int valor){
        switch (valor){
            case 1:
                classe = "Arqueiro";
                altura = 1.75;
                dano = 5;
                defesa = 4;
                vida = 70;
                energiaMagia = 3;
                velocidade = 8;
                break;
            case 2:
                classe = "Guerreiro";
                altura = 1.79;
                dano = 8;
                defesa = 7;
                vida = 80;
                energiaMagia = 5;
                velocidade = 5;
                break;
            case 3:
                classe = "Mago";
                altura = 1.70;
                dano = 6;
                defesa = 3;
                vida = 60;
                energiaMagia = 4;
                velocidade = 7;
                break;
            case 4:
                classe = "Chico linguisa";
                altura = 1.78;
                dano = 2;
                defesa = 0;
                vida = 40;
                energiaMagia = 1;
                velocidade = 2;
        }
    }

    public void obterStatus(){
        System.out.println("Classe: "+ classe);
        System.out.println("altura: "+ altura);
        System.out.println("dano:"+ dano);
        System.out.println("defesa: "+ defesa);
    }

}
