package isp.lab5.exercise4;

public class CashPayment implements PaymentGateway {
    private String typeMoney;

    public CashPayment(String typeMoney) {
        this.typeMoney = typeMoney;
    }

    @Override
    public boolean executePayment(double amount) {

        System.out.println("Payment of " + amount + " euro processed by: " + typeMoney);
        if (amount > 0) {
            return true;
        } else return false;
    }
}
