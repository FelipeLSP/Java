class Travel{
    double hours;
    double velocity;

    Travel(double pHours, double pVelocity){
        hours = pHours;
        velocity = pVelocity;
    }

    void quantityLiters(){
        double distance = velocity * hours;
        int liters = (int)distance/12;
        System.out.println(liters + " liters of fuel were used on the travel");
    }
}
