class Bank{
    static int next_bank = 1;
    final int MAX_ACCOUNTS = 10;
    String name;
    int code, next_account, ind_array;
    Account[] accounts;

    Bank(String n){
        name = n;
        code = next_bank++;
        next_account = 1;
        accounts = new Account[MAX_ACCOUNTS];
        ind_array = 0;
    }

    int getCodB(){return code;}

    String getNameB(){return name;}

    Account createAccount(String name){
        Account c;
        if (ind_array == MAX_ACCOUNTS)
            c = null;
        else{
            c = new Account(name, next_account++, this);

            accounts[ind_array++] = c;
        }
        return c;
    }

    Account searchAccount(int c){
        int i;
        for (i = 0; i < ind_array; i++)
            if (accounts[i].getCode() == c)
                return accounts[i];
        return null;
    }

    Savings createSavings(String  n){
        Savings c;
        if (ind_array == MAX_ACCOUNTS)
            c = null;
        else{
            c = new Savings(name, next_account++, this);
            accounts[ind_array++] = c;
        }
        return c;
    }
}
