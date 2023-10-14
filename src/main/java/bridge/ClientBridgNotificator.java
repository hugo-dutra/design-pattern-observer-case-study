package bridge;

import bridge.implementations.EmailNotification;
import bridge.implementations.NotificationsSender;
import bridge.implementations.PushNotification;
import bridge.implementations.SmsNotification;
import bridge.interfaces.INotification;

public class ClientBridgNotificator {
    public static void main(String[] args) {

        INotification notification = new EmailNotification();
        NotificationsSender notificationsSender = new NotificationsSender(notification);
        notificationsSender.send("title", "message", "recipient");

        INotification notification2 = new PushNotification();
        NotificationsSender notificationsSender2 = new NotificationsSender(notification2);
        notificationsSender2.send("title", "message", "recipient");

        INotification notification3 = new SmsNotification();
        NotificationsSender notificationsSender3 = new NotificationsSender(notification3);
        notificationsSender3.send("title", "message", "recipient");


    }
}
