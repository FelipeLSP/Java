class Binary{
    double dValor;
    int convertedValor;

    Binary(double valor){
        dValor = valor;
        convertedValor = (int)valor;
    }

    String decimalToBinary(){
        String result = Integer.toBinaryString(convertedValor);

    return result;
    }

}
