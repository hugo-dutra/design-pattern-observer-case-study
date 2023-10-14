package bridge.notificationmanager;

import bridge.notificationmanager.implementations.EmailNotification;
import bridge.notificationmanager.implementations.NotificationsSender;
import bridge.notificationmanager.implementations.PushNotification;
import bridge.notificationmanager.implementations.SmsNotification;
import bridge.notificationmanager.interfaces.INotification;

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
