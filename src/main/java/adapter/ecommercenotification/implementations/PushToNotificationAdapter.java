package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.INotificationSender;
import adapter.ecommercenotification.interfaces.Receiver;

public class PushToNotificationAdapter implements INotificationSender {
    private final PushProvider pushProvider;
    public PushToNotificationAdapter(PushProvider pushProvider) {
        this.pushProvider = pushProvider;
    }

    @Override
    public void send(String message, Receiver receiver) {
        pushProvider.sendPush(receiver, message);
    }
}
