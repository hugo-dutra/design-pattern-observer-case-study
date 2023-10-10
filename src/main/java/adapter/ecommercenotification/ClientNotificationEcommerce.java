package adapter.ecommercenotification;

import adapter.ecommercenotification.implementations.*;
import adapter.ecommercenotification.interfaces.INotificationSender;
import adapter.ecommercenotification.interfaces.Receiver;

public class ClientNotificationEcommerce {
    public static void main(String[] args) {

        PushProvider pushProvider = new PushProvider();
        INotificationSender pushToNotificationAdapter = new PushToNotificationAdapter(pushProvider);
        Receiver pushReceiver = new PushReceiver("appId_001");
        pushToNotificationAdapter.send("Hello", pushReceiver);

        SMSProvider smsProvider = new SMSProvider();
        INotificationSender smsToNotificationAdapter = new SMSToNotificationAdapter(smsProvider);
        Receiver smsReceiver = new SMSReceiver("321654987")    ;
        smsToNotificationAdapter.send("Hello", smsReceiver);

        EmailProvider emailProvider = new EmailProvider();
        INotificationSender emailToNotificationAdapter = new EmailToNotificationAdapter(emailProvider);
        Receiver emailReceiver = new EmailReceiver("hugo.dutra@yahoo.com.br");
        emailToNotificationAdapter.send("Hello", emailReceiver);

    }
}
