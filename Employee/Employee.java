class Employee{
    String name;
    float wage;
    int year;

    Employee (String n, float s, int a){
        name = n;
        wage = s;
        year = a;
    }

    String getName(){return name;}

    float getWage(){return wage;}

    int getYear(){return year;}

    void increasesWage(float t){
        wage += (1 + t);
    }

    public String toString(){
        return "Employee";
    }

    void print(){
        System.out.println(this + ":" + name + " " + year + " " + wage);
    }
}
