class Manager extends Employee{
    Secretary secret;
    Employee[] subord;

    Manager(String n, float s, int a, Secretary sec, Employee e1, Employee e2){
        super(n, s, a);
        subord = new Employee[2];
        secret = sec;
        subord [0] = e1;
        subord [1] = e1;
    }

    public String toString(){
        return "Manager";
    }

    void increase(){
        secret.increasesWage(0.1F);
        int i;
        for(i = 0; i < 2; i++)
            subord[i].increasesWage(0.15F);
    }

    void print(){
        super.print();
        secret.print();
        int i;
        for(i = 0; i < 2; i++)
            subord[i].print();
    }
}
