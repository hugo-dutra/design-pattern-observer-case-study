package bridge.paymentmanager.implementations;

import bridge.paymentmanager.interfaces.ITransactions;

public class PayPal implements ITransactions {
    @Override
    public void pay(float value, String title, String message, String recipient) {
        System.out.println("Paying " + value + " with PayPal to " + recipient + " with title: " + title + " and message: " + message);
    }

    @Override
    public void refund(float value, String title, String message, String recipient) {
        System.out.println("Refunding " + value + " with PayPal to " + recipient + " with title: " + title + " and message: " + message);
    }
}
