class Test{
    public static void main(String[] args){
        Employee[] list = new Employee[4];
        list[0] = new Secretary("Maria", 1000F, 2000);
        list[1] = new Employee("Jose", 500F, 1998);
        list[2] = new Employee("Joao", 700F, 2001);
        list[3] = new Manager("Vitor", 500F, 1999, (Secretary) list[0], list[1], list[2]);

        for(int i = 0; i < 4; i++);

            list[i].print();
        ((Manager) list[3]).increase();

        for(int i = 0; i < 4; i++)
            list[i].print();
        }
}
