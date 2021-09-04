public class Frutas{
    String nome; double preco; int quantidade;
    static double pTotal = 0;

    void ValorTotaldaFruta () {
        pTotal = preco * quantidade;
    }

    Frutas(String pNome, double pPreco, int pQuantidade){
        nome = pNome;
        preco = pPreco;
        quantidade = pQuantidade;
    }

    public static void main (String arg[]){

        Frutas fruta1, fruta2, fruta3;

        fruta1 = new Frutas ("Macas", 2.19, 3);
        fruta2 = new Frutas ("Peras", 1.99, 4);
        fruta3 = new Frutas ("Uvas", 3.09, 2);

        fruta1.ValorTotaldaFruta();

        System.out.println ("O Cliente comprou: " + fruta1.quantidade + " " + fruta1.nome + " por R$" + fruta1.preco + " cada e pagou: R$" + fruta1.pTotal);

        fruta2.ValorTotaldaFruta();

        System.out.println ("O Cliente comprou: " + fruta2.quantidade + " " + fruta2.nome + " por R$" + fruta2.preco + " cada e pagou: R$" + fruta2.pTotal);

        fruta3.ValorTotaldaFruta();

        System.out.println ("O Cliente comprou: " + fruta3.quantidade + " " + fruta3.nome + " por R$" + fruta3.preco + " cada e pagou: R$" + fruta3.pTotal);
    }
}
