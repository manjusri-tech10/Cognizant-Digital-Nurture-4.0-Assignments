public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(200.0);

        context.setStrategy(new PayPalPayment());
        context.executePayment(350.0);
    }
}
