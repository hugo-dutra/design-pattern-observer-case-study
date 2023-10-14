package bridge.paymentmanager;

import bridge.paymentmanager.implementations.CreditCard;
import bridge.paymentmanager.implementations.PayPal;
import bridge.paymentmanager.implementations.Transactor;
import bridge.paymentmanager.interfaces.ITransactions;

public class ClientBridgePayment {
    public static void main(String[] args) {
        ITransactions transactions = new CreditCard();
        Transactor transactor = new Transactor(transactions);
        transactor.pay(100, "Payment", "Payment for the product", "John Doe");
        transactor.refund(100, "Refund", "Refund for the product", "John Doe");

        System.out.println("--------------------------------------------------");

        ITransactions transactions2 = new PayPal();
        Transactor transactor2 = new Transactor(transactions2);
        transactor2.pay(100, "Payment", "Payment for the product", "John Doe");
        transactor2.refund(100, "Refund", "Refund for the product", "John Doe");

        System.out.println("--------------------------------------------------");

        ITransactions transactions3 = new PayPal();
        Transactor transactor3 = new Transactor(transactions3);
        transactor3.pay(100, "Payment", "Payment for the product", "John Doe");
        transactor3.refund(100, "Refund", "Refund for the product", "John Doe");
    }
}
