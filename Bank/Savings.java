class Savings extends Account{

    Savings(String n, int c, Bank b){
        super(n, c, b);
    }

    void withdraw(float sum){
        if(balance - sum < 0)
            System.out.println("Savings cannot have a negative balance");
        else
            balance -= sum;
    }

    public String toString(){
        return "Savings";
    }
}
