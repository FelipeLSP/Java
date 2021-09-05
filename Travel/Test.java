class Test{
    public static void main(String[] args){
        Travel travel1, travel2, travel3;

        travel1 = new Travel(2.5, 72.5);
        travel2 = new Travel(3.2, 80.0);
        travel3 = new Travel(2.5, 65.7);

        travel1.quantityLiters();
        travel2.quantityLiters();
        travel3.quantityLiters();
    }
}
