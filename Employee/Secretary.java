class Secretary extends
    Employee{
    String[] contacts;
    int free_pos = 0;

    Secretary(String n, float s, int a){
        super(n, s, a);
        contacts = new String[5];
    }

    void keepName(String n){
        contacts[free_pos++] = n;
        if (free_pos ==5)
            free_pos = 0;
    }

    public String toString(){
        return "Secretary";
    }
}
