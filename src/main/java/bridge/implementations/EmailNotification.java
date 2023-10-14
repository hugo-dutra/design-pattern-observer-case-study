package bridge.implementations;

import bridge.interfaces.INotification;

public class EmailNotification implements INotification {
    @Override
    public void sendMessage(String title, String message, String recipient) {
        System.out.println("Sending email to " + recipient + " with title: " + title + " and message: " + message);
    }
}
