package bridge.interfaces;

public abstract class AbstractNotifier {
    protected INotification notification;

    public AbstractNotifier(INotification notification) {
        this.notification = notification;
    }

    public abstract void send(String title, String message, String recipient);
}
