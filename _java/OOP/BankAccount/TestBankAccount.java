class TestBankAccount {

    public static void main(String[]args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1000, 2000);
        BankAccount account3 = new BankAccount(3000, 10000);
        BankAccount account4 = new BankAccount(5000, 40000);
        System.out.println(account2.getSavingsBalance());
        System.out.println(BankAccount.accountsNumber());
        account1.depositMoney(2000, "saving");
        System.out.println(account1.getTotalBalance());
        account1.depositMoney(10000, "saving");
        System.out.println(account1.getTotalBalance());
        account1.withdrawMoney(5000, "saving");
        System.out.println(account1.getTotalBalance());
        System.out.println(account4.getTotalBalance());
    }
}