package innerClass;

public class BankAccount {
    double balance = 5000;

    class Transaction {
        public void withdraw(BankAccount ba, int amount) {
            ba.balance -= amount;
            System.out.println("Withdraw " + amount + " successfully...");
        }
        public void deposit(BankAccount ba, int amount) {
            ba.balance += amount;
            System.out.println("Deposit " + amount + " successfully...");
        }
    }

    static void main() {
        BankAccount ba = new BankAccount();
        Transaction t = ba.new Transaction();

        t.withdraw(ba, 1000);
        t.deposit(ba, 200);

        System.out.println("Remaining balance: " + ba.balance);
    }
}
