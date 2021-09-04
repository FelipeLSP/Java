class Account{
    String name;
    int code;
    Bank bank;
    float balance;

    Account(String n, int c, Bank b){
        name = n;
        code = c;
        bank = b;
        balance = 0F;
    }

    Bank getBank(){return bank;}

    String getName(){return name;}

    int getCode(){return code;}

    float getBalance(){return balance;}

    void aplly(float sum){
        balance += sum;
    }

    void withdraw(float sum){
        balance -= sum;
    }
}
