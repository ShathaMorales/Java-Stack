public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalBalance = 0;

//constructor
public BankAccount(){
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    numberOfAccounts++;
}

//In the constructor, be sure to increment the account count.
public BankAccount(double checkingBalance, double savingsBalance){
    this.checkingBalance = checkingBalance;
    this.savingsBalance = savingsBalance;
    numberOfAccounts++;
}

//Create a class member (static) that has the number of accounts created thus far.
public static int accountsNumber(){
    return numberOfAccounts;
}
//Create a class member (static) that tracks the total amount of money stored in every account created.
public static double totalAmount() {
    return totalBalance;
}

//Create a getter method for the user's checking account balance.
public double getCheckingBalance(){
    return checkingBalance;
}

//Create a getter method for the user's saving account balance.
public double getSavingsBalance(){
    return savingsBalance;
}

//Create a method to see the total money from the checking and saving.
public double getTotalBalance(){
    totalBalance = checkingBalance + savingsBalance;
    return totalBalance;
}

//Create a method that will allow a user to deposit money into 
//either the checking or saving, be sure to add to total amount stored.
//Create a method to see the total money from the checking and saving.
public double depositMoney(double money, String account){
    if ("checking".equals(account)){
        checkingBalance += money;
    }
    else if ("saving".equals(account)){
        savingsBalance += money;
    }
    else {
        System.out.println("Wrong Account!");
        return -1; // indicating an error
    }
    totalBalance = checkingBalance + savingsBalance;
    return totalBalance;
}

//Create a method to withdraw money from one balance. 
//Do not allow them to withdraw money if there are insufficient funds.
//Create a method to see the total money from the checking and saving.
public double withdrawMoney(double money, String account){
    if ("checking".equals(account)){
        if (this.checkingBalance >= money) {
            this.checkingBalance -= money;
        } else {
            System.out.println("Insufficient funds!");
            return -1; // indicating an error
        }
    }
    else if ("saving".equals(account)){
        if (this.savingsBalance >= money) {
            this.savingsBalance -= money;
        } else {
            System.out.println("Insufficient funds!");
            return -1; // indicating an error
        }
    }
    else {
        System.out.println("Wrong Account!");
        return -1; // indicating an error
    }
    this.totalBalance = this.checkingBalance + this.savingsBalance;
    return this.totalBalance;
    }
    
    
    }
