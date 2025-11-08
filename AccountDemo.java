//Q 1.3
class Account {
    double balance;

    //Constructor with no arguments
    public Account() {
        this.balance = 0.0;
    }

    //Constructor with arguments
    public Account(double balance) {

        this.balance = balance;
    }

    // a) Deposit amount to account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // b) Withdraw amount from account
    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    // c) Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(1000);
        a1.withdraw(250);
        a1.displayBalance();

        Account a2 = new Account(500);
        a2.withdraw(700); // shows insufficient
        a2.displayBalance();
    }
}
