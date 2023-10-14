package bridge.paymentmanager.interfaces;

public abstract class AbstractTransactor {
    protected ITransactions transactions;

    public AbstractTransactor(ITransactions transactions) {
        this.transactions = transactions;
    }

    public abstract void pay(float value, String title, String message, String recipient);
    public abstract void refund(float value, String title, String message, String recipient);
}
