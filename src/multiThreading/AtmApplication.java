package multiThreading;

import java.util.Scanner;

class Bank {
    static int balance = 20000;

    public synchronized void withdrawal(int amount) {
        try {
            while (balance < amount) {
                printMessage("\n" + Thread.currentThread().getName() + " is waiting to withdraw...");
                wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
        balance -= amount;
        printMessage("\n" + Thread.currentThread().getName() + " withdraw " + amount + " successfully.");
    }
    public synchronized void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            printMessage("\n" + Thread.currentThread().getName() + " deposit " + amount + " successfully.");
            notify();
        } else {
            printMessage("\n" + Thread.currentThread().getName() + " entered invalid amount...");
        }
    }

    public synchronized void checkBalance() {
        printMessage("\n" + Thread.currentThread().getName() + " current balance: " + balance + ".");
    }

    public synchronized void printMessage(String message) {
        System.out.println(message);
    }
}

public class AtmApplication extends Thread {
    static boolean menu = true;
    static int choice;

    Bank b;
    int amount;

    public AtmApplication(Bank b, int amount) {
        this.b = b;
        this.amount = amount;
    }

    @Override
    public void run() {
        switch (choice) {
            case 1:
                b.withdrawal(amount);
                break;
            case 2:
                b.deposit(amount);
                break;
            case 3:
                b.checkBalance();
                break;
            default:
                menu = false;
                break;
        }
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        Bank b = new Bank();

        while (menu) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(e.getMessage());
            }

            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scan.nextInt();

            if (choice >= 4) {
                menu = false;
            }

            int amount = 0;
            if (choice == 1 || choice == 2) {
                System.out.print("Enter the amount: ");
                amount = scan.nextInt();
            }

            AtmApplication t = new AtmApplication(b, amount);
            t.start();
        }
    }
}
