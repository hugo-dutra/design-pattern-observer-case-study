package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.INotificationSender;
import adapter.ecommercenotification.interfaces.Receiver;

public class EmailProvider implements INotificationSender {
    @Override
    public void send(String message, Receiver receiver) {
        if(!(receiver instanceof EmailReceiver))
            throw new IllegalArgumentException("Receiver is not an EmailReceiver");
        System.out.println("Email sent to " + receiver.getValue() + " with Message=" + message);
    }
}
