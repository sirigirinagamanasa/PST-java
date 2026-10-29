interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

public class Week9_Task4_PaymentProcessingSystem {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();

        p1.pay(1000);
        p2.pay(500);
    }
}