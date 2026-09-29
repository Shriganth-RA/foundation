package innerClass;

class Bank {
    String bank_name;
    String branch_name;
    public Bank(String bank_name, String branch_name) {
        this.bank_name = bank_name;
        this.branch_name = branch_name;
    }

    class Account {
        long account_number;
        double balance;
        public Account(long account_number, double balance) {
            this.account_number = account_number;
            this.balance = balance;
        }
        public void displayAccountDetails() {
            System.out.println(
                    "Account number: " + account_number +
                            "\nBalance: " + balance +
                            "\nBank name: " + bank_name +
                            "\nBranch name: " + branch_name
            );
        }
    }
}

public class MemberInnerClassTask1 {
    static void main() {
        Bank b = new Bank("Indian bank", "Adayar");
        Bank.Account a = b.new Account(795480660974L, 200000.00);

        a.displayAccountDetails();
    }
}
