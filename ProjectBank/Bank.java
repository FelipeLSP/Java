class Bank{
    static int next_bank = 1;
    final int MAX_CONTAS = 10;
    String name;
    int code, next_account, ind_array;
    Account[] accounts;

    Bank(String n){
        name = n;
        code = next_bank++;
        next_account = 1;
        accounts = new Account[MAX_CONTAS];
        ind_array = 0;
    }

    int getCodeBank(){return code;}

    String getNameBank(){return name;}

    Account createAccount(String name){
        Account c;
        if(next_account == MAX_CONTAS)
            c = null;
        else{
            c = new Account(name, next_account++, this);
            accounts[ind_array++] = c;
        }
        return c;
    }
    Account searchAccount (int cod){
        int i;
        for (i = 0; i < ind_array; i++)
        if (accounts[i].getCode() == cod)
            return accounts[i];
        return null;
    }
}
