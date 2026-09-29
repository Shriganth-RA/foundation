package abstractClass;

abstract class Payment {
    abstract void pay(double amount);

    void receipt() {
        System.out.println("Receipt generated...");
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        super.receipt();
        System.out.println("Payment Rs." + amount + " is transferred through UPI.");
    }
}

class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        super.receipt();
        System.out.println("Payment Rs." + amount + " is transferred through Debit card.");
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        super.receipt();
        System.out.println("Payment Rs." + amount + " is transferred as Cash.");
    }
}

public class AbstractTask1 {
    static void main() {
        UPIPayment obj1 = new UPIPayment();
        CardPayment obj2 = new CardPayment();
        CashPayment obj3 = new CashPayment();

        obj1.pay(10000);
        obj2.pay(34000);
        obj3.pay(78000);
    }
}
