package bridge.paymentmanager.interfaces;

public interface ITransactions {
    void pay(float value, String title, String message, String recipient);
    void refund(float value, String title, String message, String recipient);
}
