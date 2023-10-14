package bridge.implementations;

import bridge.interfaces.INotification;

public class PushNotification implements INotification {
    @Override
    public void sendMessage(String title, String message, String recipient) {
        System.out.println("Sending push notification to " + recipient + " with title: " + title + " and message: " + message);
    }
}
