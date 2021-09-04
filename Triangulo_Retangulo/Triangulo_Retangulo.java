public class Triangulo_Retangulo{
    int angulo1;
    int angulo2;
    int angulo3;

    Triangulo_Retangulo (int pAngulo1, int pAngulo2, int pAngulo3){
        angulo1 = pAngulo1;
        angulo2 = pAngulo2;
        angulo3 = pAngulo3;

    }

    void ChecaAngulos (String pNome){
        if (angulo1 == 90 | angulo2 == 90 | angulo3 == 90 & angulo1 + angulo2 + angulo3 == 180)
            System.out.println("O " + pNome + " e retangulo, pois atende a todos os requisitos");
        else
            System.out.println("O Triangulo nao e Retangulo");
    }

    public static void main(String arg[]){

        Triangulo_Retangulo triangulo1, triangulo2, triangulo3;

        triangulo1 = new Triangulo_Retangulo (90, 45, 45);
        triangulo2 = new Triangulo_Retangulo (40, 80, 60);
        triangulo3 = new Triangulo_Retangulo (35, 90, 55);

        triangulo1.ChecaAngulos("triangulo1");
        triangulo2.ChecaAngulos("triangulo2");
        triangulo3.ChecaAngulos("triangulo3");

    }


}
