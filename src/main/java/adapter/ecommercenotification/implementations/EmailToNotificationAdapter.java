package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.INotificationSender;
import adapter.ecommercenotification.interfaces.Receiver;

public class EmailToNotificationAdapter implements INotificationSender {
    private final EmailProvider emailProvider;

    public EmailToNotificationAdapter(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }
    @Override
    public void send(String message, Receiver receiver) {
        emailProvider.send(message, receiver);
    }
}
