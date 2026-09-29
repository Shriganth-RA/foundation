package innerClass;

interface Payment {
    void pay();
}

public class AnonymousInnerClassTask2 {
    static void main() {
        Payment p = new Payment() {
            @Override
            public void pay() {
                System.out.println("Payment successfully.");
            }
        };

        p.pay();
    }
}