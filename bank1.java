abstract class Account {
    double balance = 0;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class MyAccount extends Account {

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class bank1 {
    public static void main(String[] args) {

        MyAccount obj = new MyAccount();

        obj.deposit(1000);
        obj.withdraw(400);
        obj.showBalance();
    }
}