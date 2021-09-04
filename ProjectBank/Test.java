class Test{
    public static void main(String[] args){
        Bank itau = new Bank("Itau");
        Account b, maria = itau.createAccount("Maria");
        System.out.println(itau.getCodeBank());
        System.out.println(itau.getNameBank());
        b = itau.searchAccount(1);
        b = itau.searchAccount(2);
        Bank bb = new Bank("Banco do Brasil");
        Account jose = bb.createAccount("Jose");
        System.out.println(jose.getName());
        System.out.println(jose.getCode());
        System.out.println(jose.getBalance());
        jose.aplly(100.0F);
        jose.withdraw(30.5F);
        System.out.println(jose.getBalance());
    }
}
