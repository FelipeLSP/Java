public class RightTriangle{
    int angle1;
    int angle2;
    int angle3;

    RightTriangle (int pAngle1, int pAngle2, int pAngle3){
        angle1 = pAngle1;
        angle2 = pAngle2;
        angle3 = pAngle3;

    }

    void checkAngles (String pName){
        if (angle1 == 90 | angle2 == 90 | angle3 == 90 && angle1 + angle2 + angle3 == 180)
            System.out.println("The " + pName + " is a right triangle, because it meets the requirements!!!");
        else
            System.out.println("The Triangle isn't a right triangle!!!");
    }

    public static void main(String[] args){

        RightTriangle triangle1, triangle2, triangle3;

        triangle1 = new RightTriangle (90, 45, 45);
        triangle2 = new RightTriangle (40, 80, 60);
        triangle3 = new RightTriangle (35, 90, 55);

        triangle1.checkAngles("triangle1");
        triangle2.checkAngles("triangle2");
        triangle3.checkAngles("triangle3");

    }


}
