package isp.lab5.exercise4;

public class CardPayment implements PaymentGateway {
    private final static String cardType = "Visa";

    @Override
    public boolean executePayment(double amount) {

        // System.out.println("Payment of " + amount + " euro processed by: " + cardType);
        if (amount > 0) {
            return true;
        } else return false;
    }
}
