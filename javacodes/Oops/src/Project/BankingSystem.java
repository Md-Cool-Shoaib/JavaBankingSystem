package Project;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    private static int totalAccounts= 0;
    double balance;
    BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountNumber = ++totalAccounts;
    }
    void deposit(double amount){
        balance = amount + balance;
    }
    void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient Balance...");
        }
    }
    void displayAccount(){
        System.out.println("AccountHolderName: "+ accountHolderName +"," + "Balance: "+ balance);
    }
    static int gettotalAccounts(){
        return totalAccounts;
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ayyan", 2000);
        BankAccount b2 = new BankAccount("Zoya", 10000);
        b1.deposit(2000);
        b1.withdraw(1000);
        b2.withdraw(15000);
        b1.displayAccount();
        b2.displayAccount();
        System.out.println("totalAccounts: "+ totalAccounts);
    }
}