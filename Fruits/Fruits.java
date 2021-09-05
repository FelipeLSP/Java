public class Fruits{
    String name; double price; int quantity;
    static double pTotal = 0;

    void totalPriceFruit () {
        pTotal = price * quantity;
    }

    Fruits(String pname, double pprice, int pquantity){
        name = pname;
        price = pprice;
        quantity = pquantity;
    }

    public static void main (String arg[]){

        Fruits fruit1, fruit2, fruit3;

        fruit1 = new Fruits ("Apples", 2.19, 3);
        fruit2 = new Fruits ("Pears", 1.99, 4);
        fruit3 = new Fruits ("Grapes", 3.09, 2);

        fruit1.totalPriceFruit();

        System.out.println ("The client buy: " + fruit1.quantity + " " + fruit1.name + " for $" + fruit1.price + " each and pay: $" + fruit1.pTotal);

        fruit2.totalPriceFruit();

        System.out.println ("The client buy: " + fruit2.quantity + " " + fruit2.name + " for $" + fruit2.price + " each and pay: $" + fruit2.pTotal);

        fruit3.totalPriceFruit();

        System.out.println ("The client buy: " + fruit3.quantity + " " + fruit3.name + " for $" + fruit3.price + " each and pay: $" + fruit3.pTotal);
    }
}
