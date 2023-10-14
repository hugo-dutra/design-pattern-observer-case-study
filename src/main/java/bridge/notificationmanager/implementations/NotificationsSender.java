package bridge.notificationmanager.implementations;

import bridge.notificationmanager.interfaces.AbstractNotifier;
import bridge.notificationmanager.interfaces.INotification;

public class NotificationsSender extends AbstractNotifier {

    public NotificationsSender(INotification notification) {
        super(notification);
    }

    @Override
    public void send(String title, String message, String recipient) {
        notification.sendMessage(title, message, recipient);
    }
}
