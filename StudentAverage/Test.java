class Test{
    public static void main(String[] args){
        Average student1, student2, student3;

        student1 = new Average(6.0F, 8.0F);
        student2 = new Average(4.5F, 6.2F, 8.5F);
        student3 = new Average(5.0F, 7.5F);

        student1.calcAverage();

        System.out.println(" ");

        student2.calcAverage();

        System.out.println(" ");

        student3.calcAverage();

        System.out.println(" ");

    }
}
