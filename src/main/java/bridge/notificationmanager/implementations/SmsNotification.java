package bridge.notificationmanager.implementations;

import bridge.notificationmanager.interfaces.INotification;

public class SmsNotification implements INotification {
    @Override
    public void sendMessage(String title, String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + " with title: " + title + " and message: " + message);
    }
}
