package bridge.paymentmanager.implementations;

import bridge.paymentmanager.interfaces.ITransactions;

public class BankTransfer implements ITransactions {
    @Override
    public void pay(float value, String title, String message, String recipient) {
        System.out.println("Paying " + value + " with bank transfer to " + recipient + " with title: " + title + " and message: " + message);
    }

    @Override
    public void refund(float value, String title, String message, String recipient) {
        System.out.println("Refunding " + value + " with bank transfer to " + recipient + " with title: " + title + " and message: " + message);
    }
}
