package chainOfResponsability.notifying.interfaces;

public interface NotifyHandler {
    void setNext(NotifyHandler handler);
    void notify(String message);
}
