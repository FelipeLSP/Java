public class ClienteBanco{
    String nome;
    int conta;
    float saldo;
    static float taxa_CPMF = 0.01F;

    void RealizaSaque (float pValor){

        saldo = saldo - pValor;
    }

    void RealizaDeposito (float pValor){

        saldo = saldo + pValor;
    }

    void RealizaTransferencia (float pValor, ClienteBanco pBeneficiado){

        RealizaSaque(pValor * ( 1 + taxa_CPMF));
        pBeneficiado.RealizaDeposito(pValor);
    }


    ClienteBanco(String pNome, int pConta, float pSaldo){
        nome = pNome;
        conta = pConta;
        saldo = pSaldo;
    }

    public static void main (String arg[]){
        ClienteBanco cliente1, cliente2;

        cliente1 = new ClienteBanco ("eu", 0001, 500);
        cliente2 = new ClienteBanco ("voce", 0002, 2000);
        System.out.println ("Saldo Atual : " + cliente1.saldo);
        cliente1.RealizaTransferencia(250, cliente2);

        System.out.println ("Saldo apos transferir : " + cliente1.saldo);
        System.out.println ("Saldo Atual do Recebedor: " + cliente2.saldo);
    }
}
