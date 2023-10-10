package adapter.ecommercenotification.implementations;

import adapter.ecommercenotification.interfaces.INotificationSender;
import adapter.ecommercenotification.interfaces.Receiver;

public class SMSToNotificationAdapter implements INotificationSender {
    private final SMSProvider smsProvider;


    public SMSToNotificationAdapter(SMSProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    @Override
    public void send(String message, Receiver receiver) {
        smsProvider.sendSms(receiver, message);
    }
}
