package adapter.ecommercenotification.interfaces;

public interface INotificationSender {
    void send(String message, Receiver receiver);
}
