package bridge.paymentmanager.implementations;

import bridge.paymentmanager.interfaces.AbstractTransactor;
import bridge.paymentmanager.interfaces.ITransactions;

public class Transactor extends AbstractTransactor {

    public Transactor(ITransactions transactions) {
        super(transactions);
    }

    @Override
    public void pay(float value, String title, String message, String recipient) {
        transactions.pay(value, title, message, recipient);
    }

    @Override
    public void refund(float value, String title, String message, String recipient) {
        transactions.refund(value, title, message, recipient);
    }
}
