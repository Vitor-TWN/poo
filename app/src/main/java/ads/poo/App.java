package ads.poo;


public class App {

    public static void main(String[] args){


        Caneta bic = new Caneta();


        System.out.println(bic.isAberta());

        System.out.println(bic.obterniveldeTinta());
        bic.abrirFechar();


        System.out.println(bic.isAberta());

        bic.definirNiveldeTinta(10);

        System.out.println(bic.desenhar(5)); // - - - - -
        System.out.println(bic.desenhar(6)); // - - - - -
        System.out.println(bic.desenhar(2)); // vazio

        bic.definirCor("preto");
        System.out.println(bic.obterCor());
        System.out.println(bic.obterniveldeTinta());


    }
}