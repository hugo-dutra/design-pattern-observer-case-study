package chainOfResponsability.notifying.interfaces;

import chainOfResponsability.notifying.models.User;

import java.util.List;

public interface NotifyHandler {
    void setNext(NotifyHandler handler);
    void attach(List<User> users);
    void detach(User observer);
    void notifyObservers(String message);
}
