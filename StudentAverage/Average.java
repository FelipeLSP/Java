public class Average{
    float firstGrade;
    float secondGrade;
    float finalGrade;

    Average(float grade1, float grade2){
        firstGrade = grade1;
        secondGrade = grade2;
    }

    Average(float grade1, float grade2, float gradeF){
        firstGrade = grade1;
        secondGrade = grade2;
        finalGrade = gradeF;
    }
    void calcAverage(){
        float stdAverage;
        stdAverage = (firstGrade + secondGrade) / 2;

        if (stdAverage >= 6)
            System.out.println("The student is approved!");

        if (stdAverage < 4)
            System.out.println("The student is failing!");

        if (stdAverage >=4 && stdAverage < 6){
            System.out.println("The student needs to make the final test!");

            if (finalGrade >= 6)
                System.out.println("The student is approved after the final test!");

            else
                System.out.println("The student is failing after the final test!");
        }
    }

}
