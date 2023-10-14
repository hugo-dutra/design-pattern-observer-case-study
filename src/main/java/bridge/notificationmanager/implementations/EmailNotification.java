package bridge.notificationmanager.implementations;

import bridge.notificationmanager.interfaces.INotification;

public class EmailNotification implements INotification {
    @Override
    public void sendMessage(String title, String message, String recipient) {
        System.out.println("Sending email to " + recipient + " with title: " + title + " and message: " + message);
    }
}
