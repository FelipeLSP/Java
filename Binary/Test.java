class Test{
    public static void main(String[] args){

       Binary decimal1, decimal2, decimal3;

       decimal1 = new Binary(257);
       decimal2 = new Binary(360.05F);
       decimal3 = new Binary(287.12);

       System.out.println(decimal1.decimalToBinary());
       System.out.println(decimal2.decimalToBinary());
       System.out.println(decimal3.decimalToBinary());
    }
}
