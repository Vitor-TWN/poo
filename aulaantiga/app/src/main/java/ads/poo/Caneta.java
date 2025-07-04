package ads.poo;


public class Caneta {


    //atributos
    private String cor;
    private double nivelTinta;
    private boolean aberta;


    //métodos
    public void definirCor(String c) {
        cor = c;
    }

    public String obterCor(){
        return cor;
    }

    public void definirNiveldeTinta(double tinta) {
        if (tinta > 100 || tinta < 0) {
            nivelTinta = 100;
        } else {
            nivelTinta = tinta;
        }
    }


    public String obterniveldeTinta(){
        return String.valueOf(nivelTinta);
    }


    public void abrirFechar() {
        aberta = !aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public String desenhar(int quantidade){

        //TODO implementar lógica
        // 1 if aberta
        // 2 quantos - eu consigo desenhar - cálculo
        // 3 debitar o quantos da tinta
        // 4 return "-".repeat(quantos);

        if (!aberta){
            abrirFechar();
            return "";
        } else if (nivelTinta == 0) {
            return "";
        }

        return "";
    }



}