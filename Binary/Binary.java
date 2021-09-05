class Binary{
    int iValor;
    float fValor;
    double dValor;
    static int convertedValor;

    Binary(int valor){
        iValor = valor;
        convertedValor = iValor;
    }

    Binary(float valor){
        fValor = valor;
        convertedValor = (int)valor;

    }

    Binary(double valor){
        dValor = valor;
        convertedValor = (int)valor;
    }

    String decimalToBinary(){
        String result = Integer.toBinaryString(convertedValor);

    return result;
    }

}
