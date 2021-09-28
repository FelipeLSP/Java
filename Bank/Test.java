class Test{

    public static void main(String[] args){
        Bank itau = new Bank("itau");
        System.out.println(itau.getCodB());
        System.out.println(itau.getNameB());
        Account maria = itau.createAccount("Maria");
        System.out.println(maria);
        Account b = itau.searchAccount(1);
        b = itau.searchAccount(2);
        Savings jose = itau.createSavings("Jose");
        System.out.println(jose + " " + jose.getName());
        System.out.println(jose + " " + jose.getCode());
        System.out.println(jose + " " + jose.getBalance());
        jose.apply(100.0F);
        System.out.println(jose + " " + jose.getBalance());
        jose.withdraw(150.0F);
        System.out.println(jose + " " + jose.getBalance());
        jose.withdraw(30.5F);
        System.out.println(jose + " " + jose.getBalance());
    }
}
